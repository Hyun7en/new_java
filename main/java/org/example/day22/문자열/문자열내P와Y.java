package org.example.day22.문자열;

public class 문자열내P와Y {
    public static void main(String[] args) {
        String s = "Pyy";
        int p = 0, y = 0;
        String s2 = s.toLowerCase();
        System.out.println(s2);
        for (char c : s2.toCharArray()) {
            if (c == 'p') p++;
            else if (c == 'y') y++;
        }//for
        if (p == y) System.out.println(true);
        else System.out.println(false);
    }
}