package org.example.day6.array3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class 웹툰순위 {
    static int start = 2; //현재 위치!
    //변수가 선언된 위치를 포함한 곳 안에서 사용 가능!
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("웹툰 순위-네이버");
        frame.setSize(440,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //데이터 준비 --> 배열(같은 속성, 같은 타입, 많을 때 사용)
        String[] title = {"윈드 브레이커", "천재 타자", "펜 홀더", "위닝 샷", "낫 오버" };
        String[] img = {"1.png", "2.png", "3.png", "4.png", "5.png"};
        double[] jumsu = {9.9, 8.8, 7.7, 6.6, 5.5};


        //입력 --> 처리 --> 출력

        //텍스트 3개들어갈 자리(위, 아래, 포스터 이미지)
        JLabel top = new JLabel();
        top.setText(title[2]);

        JLabel under = new JLabel();
        under.setText(jumsu[2] + "");
        //String.valueOf(jumsu[2]);

        JLabel center = new JLabel();
        //center.setText("이미지 포스터");
        ImageIcon icon = new ImageIcon(img[2]);
        center.setIcon(icon);

        JButton left = new JButton();
        left.setText("<<");

        JButton right = new JButton();
        right.setText(">>");
        right.addActionListener(new ActionListener() {
            //addActionListener(처리하는 부품)는 버튼을
            //클릭했을 때 처리하는 기능을 더함.
            public void actionPerformed(ActionEvent e) {
                //이 actionPerformed()가 자동으로
                //내가 클릭했을 때 실행되는 부분!
                if(start < 4) {
                    System.out.println("오른쪽 버튼을 눌렀구나.!");
                    start++;//3
                    top.setText(title[start]);
                    under.setText(jumsu[start] + "");
                    ImageIcon icon = new ImageIcon(img[start]);
                    center.setIcon(icon);
                }else if (start == 4) {
                    JOptionPane.showMessageDialog(frame, "마지막페이지입니다.");
                }
            }
        });

        left.addActionListener(new ActionListener() {
            //addActionListener(처리하는 부품)는 버튼을
            //클릭했을 때 처리하는 기능을 더함.
            public void actionPerformed(ActionEvent e) {
                //이 actionPerformed()가 자동으로
                //내가 클릭했을 때 실행되는 부분!
                if(start > 0) {
                    System.out.println("왼쪽 버튼을 눌렀구나.!");
                    start--; //1
                    top.setText(title[start]);
                    under.setText(jumsu[start] + "");
                    ImageIcon icon = new ImageIcon(img[start]);
                    center.setIcon(icon);
                }else if (start == 0) {
                    JOptionPane.showMessageDialog(frame, "시작페이지입니다");
                }
            }
        });


        Font font = new Font("궁서", Font.BOLD, 25); //통장(이름, 금액, ...)

        top.setFont(new Font("궁서", Font.BOLD, 35));
        under.setFont(font);
        left.setFont(font);
        right.setFont(font);

        left.setBackground(Color.GREEN);
        right.setBackground(Color.GREEN);
        left.setForeground(Color.BLUE);
        right.setForeground(Color.BLUE);

        frame.add(left, BorderLayout.WEST);
        frame.add(right, BorderLayout.EAST);
        frame.add(top, BorderLayout.NORTH);
        frame.add(under, BorderLayout.SOUTH);
        frame.add(center, BorderLayout.CENTER);

        //맨 끝!!
        frame.setVisible(true);
    }
}