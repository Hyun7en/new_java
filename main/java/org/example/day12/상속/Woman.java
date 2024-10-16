package org.example.day12.상속;

public class Woman extends Person {
    int walk;

/*
    public Woman() {
        super();
    }
*/

    public Woman(String name, char gender, int walk) {
        super(name, gender);
        this.walk = walk;
    }



}
