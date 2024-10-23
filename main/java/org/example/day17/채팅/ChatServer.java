package org.example.day17.채팅;

import java.io.*;
import java.net.*;
import java.util.*;

public class ChatServer {
    private static Set<PrintWriter> clientWriters = new HashSet<>();
    private static Set<String> clientNicknames = new HashSet<>();
    private static Map<String, Long> mutedUsers = new HashMap<>(); // 금지된 사용자 목록
    private static Set<String> kickedUsers = new HashSet<>(); // 강퇴된 사용자 목록
    private static final String ADMIN_NICKNAME = "관리자"; // 고정된 관리자 닉네임

    public static void main(String[] args) {
        System.out.println("채팅 서버 시작...");
        try (ServerSocket serverSocket = new ServerSocket(8888)) {
            while (true) {
                Socket clientSocket = serverSocket.accept();
                System.out.println("클라이언트 연결됨: " + clientSocket.getInetAddress());

                // 클라이언트 스레드 생성
                ClientHandler clientHandler = new ClientHandler(clientSocket);
                new Thread(clientHandler).start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static class ClientHandler implements Runnable {
        private Socket socket;
        private PrintWriter writer;
        private String nickname;

        public ClientHandler(Socket socket) {
            this.socket = socket;
        }

        @Override
        public void run() {
            try {
                BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                writer = new PrintWriter(socket.getOutputStream(), true);

                // 닉네임 요청
                while (true) {
                    writer.println("닉네임을 입력하세요 (1~10자의 영문자 또는 숫자):");
                    nickname = reader.readLine();
                    if (ADMIN_NICKNAME.equals(nickname) ||
                            (nickname != null && !nickname.trim().isEmpty() && nickname.matches("^[a-zA-Z0-9]{1,10}$") && !clientNicknames.contains(nickname))) {
                        clientNicknames.add(nickname);
                        break; // 유효한 닉네임이면 루프 종료
                    } else {
                        writer.println("닉네임은 1~10자의 영문자 또는 숫자만 허용됩니다.");
                    }
                }

                synchronized (clientWriters) {
                    clientWriters.add(writer);
                }

                String message;
                while ((message = reader.readLine()) != null) {
                    // 강퇴된 사용자 메시지 처리
                    if (kickedUsers.contains(nickname)) {
                        writer.println("서버: 당신은 강퇴되었습니다. 채팅에 참여할 수 없습니다.");
                        continue; // 강퇴된 사용자는 메시지를 보내지 못하도록
                    }

                    // 명령어 처리
                    if (message.startsWith("/kick") || message.startsWith("/mute")) {
                        if (ADMIN_NICKNAME.equals(nickname)) {
                            handleAdminCommand(message);  // 관리자 명령어 처리
                        } else {
                            writer.println("관리자만 사용할 수 있는 명령어입니다.");
                        }
                    } else {
                        broadcastMessage(nickname + ": " + message);  // 일반 메시지 전송
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                cleanup();
            }
        }

        private void cleanup() {
            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            synchronized (clientWriters) {
                clientWriters.remove(writer);
            }
            synchronized (clientNicknames) {
                if (nickname != null) {
                    clientNicknames.remove(nickname); // 닉네임 제거
                    kickedUsers.remove(nickname); // 강퇴 사용자 목록에서 제거
                }
            }
        }

        private void broadcastMessage(String message) {
            synchronized (clientWriters) {
                for (PrintWriter writer : clientWriters) {
                    writer.println(message);
                }
            }
        }

        private void handleKickCommand(String command) {
            String[] parts = command.split("\\s+");
            if (parts.length == 2) {
                String nicknameToKick = parts[1];
                if (clientNicknames.contains(nicknameToKick)) {
                    broadcastMessage(nicknameToKick + "님이 강퇴되었습니다.");
                    kickedUsers.add(nicknameToKick); // 강퇴된 사용자 목록에 추가
                } else {
                    for (PrintWriter writer : clientWriters) {
                        writer.println("서버: " + nicknameToKick + "님은 현재 접속 중이지 않습니다.");
                    }
                }
            }
        }

        private void handleMuteCommand(String command) {
            String[] parts = command.split("\\s+");
            if (parts.length == 2) {
                String nicknameToMute = parts[1];
                if (clientNicknames.contains(nicknameToMute)) {
                    mutedUsers.put(nicknameToMute, System.currentTimeMillis() + 60000); // 1분 동안 금지
                    broadcastMessage(nicknameToMute + "님이 1분 동안 채팅 금지되었습니다.");
                } else {
                    for (PrintWriter writer : clientWriters) {
                        writer.println("서버: " + nicknameToMute + "님은 현재 접속 중이지 않습니다.");
                    }
                }
            }
        }

        private void handleAdminCommand(String command) {
            if (command.startsWith("/kick")) {
                handleKickCommand(command);
            } else if (command.startsWith("/mute")) {
                handleMuteCommand(command);
            }
        }
    }
}
