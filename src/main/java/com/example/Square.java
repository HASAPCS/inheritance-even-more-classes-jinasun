package com.example;

public class Square extends Shape {
    private double length;

    public Square(double length){
        this.length = length;
    }

    public double getlength(){
        return length;
    }

    public void setlength(double length){
        this.length = length;
    }
    // TODO: Define attributes for the square

    @Override
    public double area() {
        // TODO: Implement the method
        return length*length;
    }

    @Override
    public double perimeter() {
        // TODO: Implement the method
        return length*4;
    }
}