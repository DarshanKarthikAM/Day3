package com.training.org;

public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        super();
        this.radius = radius;
    }

    public double getArea() {
        double area = 3.142 * radius * radius;
        return area;
    }
}
