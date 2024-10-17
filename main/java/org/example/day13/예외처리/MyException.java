package org.example.day13.예외처리;

public class MyException extends Exception {
    //Exception의 message필드

    public MyException(String message) {
        super(message);
    }
}
