package com.training.org;

public class MainClass {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(15, 10);
        System.out.println(r1.getArea());

        Circle c = new Circle(10);
        System.out.println(c.getArea());
    }
}
