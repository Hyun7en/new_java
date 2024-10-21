package org.example.test;

public class Programmers {
    public static void main(String[] args) {


        What.getW(0);

        //end
    }
}
class What<T> {
    int value = 3;

    public static void getW(int value){
        Type t = new Type();
        t.getType(value);
    }
}

class Type{

    public void getType(Integer value){
        System.out.println("1");
    }

    public void getType(Object value){
        System.out.println("2");
    }

    public void getType(Number value){
        System.out.println("3");
    }

}





