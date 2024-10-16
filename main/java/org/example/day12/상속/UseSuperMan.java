package org.example.day12.상속;

public class UseSuperMan {
    public static void main(String[] args) {
        SuperMan superMan = new SuperMan("수퍼",'M',222);

        superMan.eat();
        superMan.sleep();
        superMan.powerUp();
        superMan.runQuickly();
        superMan.fly();

        //end
    }
}
