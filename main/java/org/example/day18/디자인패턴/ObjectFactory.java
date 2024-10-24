package org.example.day18.디자인패턴;

public class ObjectFactory {


    public Object getInstance(String name){
        if (name.equalsIgnoreCase("apple")){
            return new AppleClass();
        }else if (name.equalsIgnoreCase("banana")){
            return new BananaClass();
        }else if (name.equalsIgnoreCase("ice")){
            return new IceClass();
        }

        return null;
    }
}