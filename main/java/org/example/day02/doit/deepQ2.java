package org.example.day02.doit;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//스윙 사용
public class deepQ2 {
    static int game = 0;
    static int person1 = 0;
    static int person2 = 0;

    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setSize(350, 200);

        Font font = new Font("궁서", Font.BOLD, 20);
        FlowLayout layout = new FlowLayout();
        f.setLayout(layout);

        //title
        f.setTitle("Number Game");

        //======== 그리기 ========

        //버튼 만들기
        JButton b1 = new JButton();
        JButton b2 = new JButton();
        b1.setText("계속");
        b2.setText("종료");
        b1.setFont(font);
        b2.setFont(font);

        JLabel l1 = new JLabel();
        l1.setText("게임을 계속 하시겠습니까?");
        l1.setFont(font);

        //add
        f.add(l1);
        f.add(b1);
        f.add(b2);


        //게임 계속
        b1.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                game++;

                int num1 = Integer.parseInt(JOptionPane.showInputDialog("첫 번째 사람이 숫자를 입력하세요."));
                int num2 = Integer.parseInt(JOptionPane.showInputDialog("두 번째 사람이 숫자를 입력하세요."));

                JOptionPane.showMessageDialog(null,num1>num2 ? "첫 번째 사람이 이겼습니다":"두 번째 사람이 이겼습니다.");
                if(num1>num2){
                    person1++;
                }else{
                    person2++;
                }
            }
        });

        //게임 종료
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"총 게임수: " + game + "\n첫 번째 사람이 이긴 수: " + person1 + "\n두 번째 사람이 이긴 수: " + person2);
            }
        });

        //end
        f.setVisible(true);
    }
}
