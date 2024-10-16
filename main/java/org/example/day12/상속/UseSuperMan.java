package org.example.day12.상속;

public class UseSuperMan {
    public static void main(String[] args) {
        SuperMan superMan = new SuperMan();
        superMan.name = "ddd";
        superMan.gender = 'M';

        superMan.eat();
        superMan.sleep();
        superMan.powerUp();
        superMan.runQuickly();
        superMan.fly();

        //end
    }
}
