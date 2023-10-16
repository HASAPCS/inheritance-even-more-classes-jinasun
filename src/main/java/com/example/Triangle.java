package com.example;

public class Triangle extends Shape {
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(double sideA, double sideB, double sideC){
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public double getSideC() {
        return sideC;
    }
    
    public void setSideC(double sideC) {
        this.sideC = sideC;
    }
    // TODO: Define attributes for the triangle

    @Override
    public double area() {
        double s = (sideA+sideB+sideC)/2; //用海倫公式，先求出變量
        // TODO: Implement the method
        return  sideA*sideB/2;
    }

    @Override
    public double perimeter() {
        // TODO: Implement the method
        return sideA+sideB+sideC;
    }
}

// TODO: Implement similar classes for Circle and Square
