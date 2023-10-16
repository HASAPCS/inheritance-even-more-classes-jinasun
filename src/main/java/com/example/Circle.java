package com.example;

public class Circle extends Shape {
    private double radius;
    // TODO: Define attributes for the circle

    public Circle (double radius){
        this.radius = radius;
    }

    public double getRadius(){
        return this.radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }
    @Override
    public double area() {
        // TODO: Implement the method
        return Math.PI*radius*radius;
    }

    @Override
    public double perimeter() {
        // TODO: Implement the method
        return Math.PI*2*radius;
    }
}