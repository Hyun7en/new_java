package org.example.day9.메모리그림;

public class OrderMain {
    public static void main(String[] args) {
        Item item1 = new Item();
        item1.name = "햄버거";
        item1.price = 50.5;
        Item item2 = new Item();
        item2.name = "냉면";
        item2.price = 60.5;
        Item item3 = new Item();
        item3.name = "커피";
        item3.price = 5.5;
        System.out.println("1-> " + item1.getName() + ": " + item1.getPrice() + "$");
        System.out.println("2-> " + item2.getName() + ": " + item2.getPrice() + "$");
        System.out.println("3-> " + item3.getName() + ": " + item3.getPrice() + "$");
    }

}
