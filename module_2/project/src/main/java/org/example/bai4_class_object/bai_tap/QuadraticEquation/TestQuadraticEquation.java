package org.example.bai4_class_object.bai_tap.QuadraticEquation;

import java.util.Scanner;

public class TestQuadraticEquation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("NNhập số a: ");
        double a = Double.parseDouble(scanner.nextLine());
        System.out.print("NNhập số b: ");
        double b = Double.parseDouble(scanner.nextLine());
        System.out.print("NNhập số c: ");
        double c = Double.parseDouble(scanner.nextLine());

        QuadraticEquation classQuadraticEquation = new QuadraticEquation(a, b, c);

        if (classQuadraticEquation.getDiscriminant() == 0) {
            System.out.println("Phương trình có nghiệm kép: " + classQuadraticEquation.getRoot1());
        } else if (classQuadraticEquation.getDiscriminant() > 0) {
            System.out.println("Phương trình có 2 nghiệm phân biệt: " + classQuadraticEquation.getRoot1() + " và " + classQuadraticEquation.getRoot2());
        } else {
            System.out.println("The equation has no roots");
        }
    }
}
