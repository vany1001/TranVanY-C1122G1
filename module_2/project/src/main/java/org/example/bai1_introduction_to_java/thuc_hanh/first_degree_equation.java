package org.example.bai1_introduction_to_java.thuc_hanh;
import java.util.Scanner;

public class first_degree_equation {

    public static void main(String[] args) {

        System.out.println("giai phương trinh bậc nhât ");
        Scanner scanner = new Scanner(System.in);

        System.out.print("nhap a: ");
        double a = scanner.nextDouble();


        System.out.print("nhap b: ");
        double b = scanner.nextDouble();


        System.out.print("nhap c: ");
        double c = scanner.nextDouble();

        if(a != 0) {
            double answer = (c -b) / a;
            System.out.println("ket qua là " + answer);
        } else  {
            System.out.println("phương trình vô nghiệm");
        }

    }
}
