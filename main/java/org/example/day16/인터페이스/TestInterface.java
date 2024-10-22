package org.example.day16.인터페이스;

public interface TestInterface {
    //설계도 역할!
    //아직 완전한 클래스가 아님.
    //테스트해야해, 입력으로 스트링으로 해야해.
    public abstract void test(String name); //추상메서드
    //불완전한 메서드 == 추상(abstract)메서드
    //public abstract은 생략 가능
    //검증해야해, 입력은 시간과 분을 입력해야해, 리턴은 잘되었는지
    //논리형으로 리턴해야해.
    //메서드 이름 : result
    public abstract boolean result(int hour, int min);
    //인터페이스는 추상메서드로로만 만든다.! 기능중심으로 해서 설계!
    //           필드는 들어가지 않는다.!

}