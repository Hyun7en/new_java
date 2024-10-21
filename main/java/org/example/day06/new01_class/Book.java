package org.example.day06.new01_class;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Book {
    private String title;
    private String author;
    private String isbn;

    // 메인 메서드
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>(); // 여러 책을 저장할 리스트
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("============================================");
            System.out.println("1. 책 등록  2. 등록된 책 확인  3.책 삭제  4.나가기");
            System.out.print("번호를 선택하세요: ");
            int num = sc.nextInt();
            sc.nextLine();

            switch (num) {
                case 1:
                    // 책 등록
                    Book book = new Book();
                    System.out.println("책제목, 작가, isbn을 순서대로 입력 >> ");
                    book.setTitle(sc.nextLine());
                    book.setAuthor(sc.nextLine());
                    book.setIsbn(sc.nextLine());
                    books.add(book); // 리스트에 책 추가
                    System.out.println("책이 등록되었습니다.");
                    break;

                case 2:
                    // 등록된 책 확인
                    System.out.println("등록된 책의 정보를 확인합니다:");
                    if (books.isEmpty()) {
                        System.out.println("등록된 책이 없습니다.");
                    } else {
                        for (Book b : books) {
                            System.out.println(b.displayInfo());
                        }
                    }
                    break;

                case 3:
                    // 책 삭제
                    System.out.println("삭제할 책의 제목 또는 ISBN을 입력 >> ");
                    String deleteKey = sc.nextLine();
                    boolean found = false;

                    for (int i = 0; i < books.size(); i++) {
                        Book b = books.get(i);
                        if (deleteKey.equals(b.getTitle()) || deleteKey.equals(b.getIsbn())) {
                            books.remove(i);
                            System.out.println("책이 삭제되었습니다.");
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("일치하는 책이 없습니다.");
                    }
                    break;

                case 4:
                    // 나가기
                    System.out.println("종료합니다.");
                    sc.close();
                    return;

                default:
                    System.out.println("유효하지 않은 번호입니다. 다시 선택해주세요.");
            }
        }
    }

    // Setter 메서드들
    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    // Getter 메서드들
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    // 책 정보를 출력하는 메서드
    public String displayInfo() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", isbn='" + isbn + '\'' +
                '}';
    }
}
