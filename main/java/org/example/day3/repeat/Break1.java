package org.example.day3.repeat;

public class Break1 {
    public static void main(String[] args) {
        for(int i = 1; i <= 10; i++){
            if( i ==9){
                break;
            }
            if( i % 3 == 0){
                continue;
            }

            System.out.println(i);
        }

    }
}
