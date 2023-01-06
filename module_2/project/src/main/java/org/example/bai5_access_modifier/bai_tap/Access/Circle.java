package org.example.bai5_access_modifier.bai_tap.Access;

public class Circle {
    private double radius = 1.0;
    private String color = "red";
    public Circle(){

    }

    public Circle(double radius) {
        this.radius = radius;
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
        return Math.PI * radius * radius;
    }

    public String toString() {
        return radius + "+" + color + "+" + getArea();
    }


}
