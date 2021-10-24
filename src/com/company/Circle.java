package com.company;


public class Circle {


    private double radius;

    static final double PI = 3.1415;


    public Circle() {

    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double circumference() {

        return 2 * PI * radius;
    }


    public double area() {

        return radius * radius * PI;
    }


}