package org.example.day13.예외처리;

public class Test {
    public static void main(String[] args) {
        try {
            int[] numbers = {1, 2, 3};
            int result = numbers[5] / 0;  // 배열 인덱스 초과와 0으로 나누기 시도
            //int result = numbers[2] / 0;
            //int result = numbers[2] / 1;
            System.out.println("결과: " + result);
            String s = null;
            System.out.println(s.length());
        } catch (ArithmeticException e) {
            // 0으로 나눌 때 발생하는 예외 처리
            System.out.println("예외 발생: 0으로 나눌 수 없습니다.");
        } catch (ArrayIndexOutOfBoundsException e) {
            // 배열의 잘못된 인덱스 접근 시 발생하는 예외 처리
            System.out.println("예외 발생: 배열의 인덱스가 잘못되었습니다.");
        } catch (Exception e){
            //위에 쓴 에러 이외의 예외 처리
            System.out.println(e.getMessage());
        }finally {
            // 예외 발생 여부와 상관없이 항상 실행되는 코드
            System.out.println("프로그램이 종료되었습니다.");
        }
    }
}