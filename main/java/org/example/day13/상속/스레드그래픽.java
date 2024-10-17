package org.example.day13.상속;

import javax.swing.*;
import java.awt.*;
import java.util.Date;

public class 스레드그래픽 extends JFrame {
    JLabel count, image, day; //전역변수, 아무데서나 접근 가능.

    public 스레드그래픽(){
        setSize(700, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        count = new JLabel("카운트");
        image = new JLabel();
        day = new JLabel("년월일");

        FlowLayout flow = new FlowLayout(); //add()할때 순서대로 화면에 배치!
        setLayout(flow);

        Font font = new Font("궁서", Font.BOLD, 80);
        count.setFont(font);
        image.setFont(font);
        day.setFont(font);

        //Jframe에 끼워넣음.
        add(count);
        add(image);
        add(day);

        카운터스레드2 c = new 카운터스레드2();
        c.start();
        배열스레드2 a = new 배열스레드2();
        a.start();
        시각스레드2 t = new 시각스레드2();
        t.start();


        //맨끝!
        setVisible(true);
    } //생성자

    //클래스안에 끼워진 클래스(내부클래스, innerClass)
    //전역변수를 공유할 목적으로!
    public class 시각스레드2 extends Thread{

        public void run(){
            for (int i = 0; i < 3000; i++) {
                System.out.println("시각 >> " + new Date());
                day.setText("시각 >> " + new Date());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("문제가 생김.");
                }
            }
        }
    } //시각스레드2 클래스

    public class 카운터스레드2 extends Thread{
        public void run(){
            for (int i = 500; i > 0; i--) {
                System.out.println("카운터 >> " + i);
                count.setText("카운터 >> " + i);
                try {
                    Thread.sleep(500); //1초(1000), 500(0.5초)
                } catch (InterruptedException e) {
                    System.out.println("문제가 생김.");
                }
            }
        }
    } //카운터스레드2

    public class 배열스레드2 extends Thread{
        String[] foods = {"my01.png", "my02.png", "my03.png", "my04.png", "my05.png"};

        public void run(){
            for (int i = 0; i < foods.length; i++) {
                System.out.println("배열 >> " + foods[i]);
                ImageIcon icon = new ImageIcon(foods[i]);
                image.setIcon(icon);
                //image.setText("배열 >> " + foods[i]);
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    System.out.println("문제가 생김.");
                }
            }
        }
    }

}