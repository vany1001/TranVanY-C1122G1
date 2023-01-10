package org.example.bai7_AbstractClass_Interface.thuc_hanh.InterfaceComparable;

import javax.swing.plaf.PanelUI;

public class Circle {

    private double radius;
    private String color;
    private Boolean filled;

    public Boolean getFilled() {
        return filled;
    }

    public void setFilled(Boolean filled) {
        this.filled = filled;
    }

    public Circle() {

    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color,boolean filled) {
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return radius*radius*Math.PI;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "Radius=" + radius +
                ", Color='" + color +
                ", Bolean= " + filled + '\'' +
                '}' ;

    }
}
