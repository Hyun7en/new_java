package org.example.day8.class만들기;

import java.util.Date;

public class 계산기2 {
    public int add(int x, int y){
        return x + y;
    }
    public double add(int x, double y){
        return x + y;
    }
    public double add(double x, double y){
        return x + y;
    }
    public String add(String x, int y){
        return x + y;
    }
    public int[] add(){
        int[] num = {1,2,3};
        return num;
    }
    public int call(){
        Date date = new Date();
        int month = date.getMonth() + 1;
        return month;
    }
}