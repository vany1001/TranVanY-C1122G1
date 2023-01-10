package org.example.bai7_AbstractClass_Interface.bai_tap.InterfaceResizeable;

public class Circle extends Shape implements Resizeable {
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * getRadius() * getRadius();
    }

    @Override
    public double getPrimeter() {
        return Math.PI * 2 * getRadius();
    }

    @Override
    public double resize() {
        setRadius(this.radius + this.radius * Math.random());
        return getArea();
    }

    @Override
    public String toString() {
        return "Area = " + getArea();
    }
}
