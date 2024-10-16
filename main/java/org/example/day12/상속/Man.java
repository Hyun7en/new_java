package org.example.day12.상속;

public class Man  extends Person{
    int power;

    public Man(String name, char gender, int power) {
        //super()항상 맨 첫줄에 써야함!
        super(name, gender);
        this.power = power;
    }

    //public Man() {
        //super();
        //상속받는 클래스에서 생성자 호출시
        //부모 객체부터 먼저 만들어야 파생이 되므로
        //부모 클래스의 생성자부터 먼저 호출해야함
    //}

    @Override
    public void sleep() {
        super.sleep();
    }

    @Override
    public void eat() {
        super.eat();
    }

    public void powerUp(){
        System.out.println("힘이 나름 쎔");
    }

    public void runQuickly(){
        System.out.println("빨리 달림");
    }
}
