package org.example.day22.문자열;

public class 대문자소문자 {
    public static void main(String[] args) {
        String myString = "cccCCC";
        char[] c = myString.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        for (char x : c) {
            //소문자이면 대문자로
            if(x >= 'a' && x <= 'z') x -= 32;
                //대문자이면 소문자로
            else if (x >= 'A' && x <= 'Z') x += 32;
            stringBuilder.append(x);
        }//for
        System.out.println(stringBuilder.toString());
    }
}