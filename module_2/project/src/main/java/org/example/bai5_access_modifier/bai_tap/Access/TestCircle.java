package org.example.bai5_access_modifier.bai_tap.Access;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle();

        circle.setColor("Blue");
        circle.setRadius(5);
        System.out.println(circle.toString());

    }
}
