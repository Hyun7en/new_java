package org.example.day12.스레드;

public class MultiTread  {
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();
        StarTread t3 = new StarTread();

          t1.start();
          t2.start();
        //t3.start();

        //end
    }

}
