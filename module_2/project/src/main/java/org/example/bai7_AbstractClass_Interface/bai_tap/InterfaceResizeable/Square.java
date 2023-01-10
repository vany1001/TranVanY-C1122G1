package org.example.bai7_AbstractClass_Interface.bai_tap.InterfaceResizeable;

public class Square extends Shape implements Resizeable {
    private double a;

    public Square(String color, double a) {
        super(color);
        this.a = a;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    @Override
    public double getArea() {
        return a * a;
    }

    @Override
    public double getPrimeter() {
        return a * 4;
    }

    @Override
    public double resize() {
        double z = Math.random();
        setA(getA() + z);
        return getArea();
    }
}
