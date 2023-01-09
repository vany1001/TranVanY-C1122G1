package org.example.bai5_ke_thua.bai_tap.Layer;

import java.util.SplittableRandom;

public class Cylinder extends Circle {

    private double height;

    public Cylinder() {

    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double getVolume() {
        return getArea() * this.height;
    }

    @Override
    public String toString() {
        return "height= " + height + " _ " + super.toString() + " _ " + getVolume();
    }
}

