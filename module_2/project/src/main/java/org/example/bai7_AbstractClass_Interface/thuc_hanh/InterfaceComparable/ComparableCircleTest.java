package org.example.bai7_AbstractClass_Interface.thuc_hanh.InterfaceComparable;

import java.util.Arrays;

public class ComparableCircleTest {
    public static void main(String[] args) {
        ComparableCircle[] circles = new ComparableCircle[3];
        circles[0] = new ComparableCircle(3.6);
        circles[1] = new ComparableCircle(3.6,"Black",false);
        circles[2] = new ComparableCircle();
        for (ComparableCircle element: circles) {
            System.out.println(element);


            Arrays.sort(circles);

            System.out.println("After-sorted:");
            for (ComparableCircle circle : circles) {
                System.out.println(circle);
            }

        }
    }
}
