package org.example.test;

public class Programmers {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();

        String a = "1a2b3c4d123Z";
        int answer = 0 ;
        for(int i = 0; i < a.length(); i++){

            char b = a.charAt(i);

            if(Character.isDigit(b)){
                sb.append(b);
            }else{
                if(!sb.isEmpty()){
                    answer += Integer.parseInt(sb.toString());
                    sb.setLength(0);
                }
            }

        }

        if(!sb.isEmpty()){
            answer += Integer.parseInt(sb.toString());
        }


        System.out.println(answer);
        //end
    }


}

