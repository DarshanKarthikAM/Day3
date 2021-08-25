package com.training.org;

public class Rectangle extends Shape {
    public Rectangle(double height, double width) {
        super(height, width);
    }

    public double getArea() {
        double area = getHeight() * getWidth();
        return area;
    }
}
