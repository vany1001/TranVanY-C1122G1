package org.example.bai7_AbstractClass_Interface.bai_tap.InterfaceResizeable;

public abstract class Shape {
    String color;

    public Shape(String color) {
        this.color = color;
    }

    abstract public double getArea();

    abstract public double getPrimeter();

}
