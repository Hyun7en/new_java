package org.example.day13.예외처리;

public class Account {
    public void money() throws MyException{
        int n = 10000;
        if(n >= 10000){
            throw new MyException("돈이 너무 큼.");
        }
    }
}