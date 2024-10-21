package org.example.day09.문자파일;

import java.io.*;

public class 버퍼사용성능개선 {
    public static void main(String[] args) {
        try {
            InputStream is = new FileInputStream("c:/data/공부.txt");
            Reader reader = new InputStreamReader(is);
            BufferedReader bf = new BufferedReader(reader);
            //BufferedReader bf2 = new BufferedReader(new BufferedReader(new FileInputStream("c:/data/공부.txt")));
            long start = System.nanoTime();
            while (true){
                String line = bf.readLine();
                if(line == null) break;
                System.out.println(line);
            }
            long end = System.nanoTime();
            System.out.println(end-start);
            is.close();
            reader.close();
            bf.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
    /*
1. 파일을 다루는 클래스 종류와 비교

FileInputStream / FileOutputStream: 바이트 스트림을 사용해 파일의 원시 데이터를 처리하는 클래스입니다. 이미지, 오디오, 비디오 등과 같은 이진 데이터를 다룰 때 사용합니다.
FileReader / FileWriter: 문자 스트림을 사용해 텍스트 데이터를 처리하는 클래스입니다. 텍스트 파일을 읽거나 쓸 때 주로 사용하며, 바이트를 문자로 변환하는 과정을 포함합니다.

2. 바이트 스트림과 문자 스트림의 차이

바이트 스트림: 1바이트씩 데이터를 처리하며, InputStream과 OutputStream의 하위 클래스로 이루어져 있습니다. 주로 이진 데이터를 다룰 때 사용합니다.
문자 스트림: 2바이트(유니코드)를 처리하며 Reader와 Writer 클래스를 기반으로 합니다. 텍스트 데이터를 처리할 때 주로 사용합니다.

3. Reader, Writer가 붙어있는 클래스

문자 스트림입니다. Reader와 Writer는 텍스트를 처리하기 위해 설계된 클래스입니다.

4. 스트림이란?

데이터의 흐름을 추상화한 개념으로, 프로그램과 파일, 네트워크, 또는 다른 입력/출력 장치 간의 데이터 이동을 다루기 위한 방법입니다. 스트림은 한 방향으로만 흐르며, 입력 스트림과 출력 스트림으로 나뉩니다.

5. 바이트 스트림으로 여러 바이트 읽기

BufferedInputStream 또는 ByteArrayInputStream을 사용하면 바이트 데이터를 한 번에 여러 개씩 읽어 저장할 수 있습니다.

6. 바이트 스트림을 문자 스트림으로 변환하는 클래스

InputStreamReader입니다. 바이트 스트림으로 입력받은 데이터를 문자 스트림으로 변환해 읽을 수 있게 해줍니다.

7.Buffer를 사용하면 좋은 점 (2가지)

성능 향상: 데이터 입출력 시 한 번에 다량의 데이터를 읽고 쓰기 때문에 속도가 향상됩니다.
자원 절약: I/O 호출을 줄여 시스템 자원 소모를 줄일 수 있습니다.

8. 스트림을 다룰 때 꼭 해주어야 하는 것

스트림을 사용한 후에는 반드시 close() 메서드를 호출해 스트림을 닫아 자원을 해제해줘야 합니다.

9. 버퍼로 데이터를 한 줄씩 읽을 때 리턴 타입

String 타입으로 반환됩니다.

10. 버퍼에서 데이터를 한 줄씩 읽을 때 더 이상 데이터가 없을 때 반환

null이 반환됩니다.
     */

}