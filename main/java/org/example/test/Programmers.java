package org.example.test;


import java.util.ArrayList;
import java.util.List;

public class Programmers {
    public static void main(String[] args) {

        int[] answer = {};
        int[] arr = {293, 1000, 395, 678, 94};


        List list = new ArrayList();

        for(Integer a : arr){
            list.add(a);
        }

        Integer a = 293;

        list.remove(a);


        System.out.println(list);

        //end
    }


}





