package org.example.bai15_XuLiNgoaiLe_Debug.bai_tap;

import java.util.Scanner;

public class Illegal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Triangle check = new Triangle();
        boolean flag;
        do {
            try {
                System.out.print("Nhập cạnh thứ nhất: ");
                double a = Double.parseDouble(scanner.nextLine());
                System.out.print("Nhập cạnh thứ hai: ");
                double b = Double.parseDouble(scanner.nextLine());
                System.out.print("Nhập cạnh thứ ba: ");
                double c = Double.parseDouble(scanner.nextLine());
                flag = false;
                check.checkTriangle(a, b, c);
            } catch (IllegalTriangleException e) {
                System.out.println(e.getMessage());
                flag = true;
            } catch (NumberFormatException e) {
                System.out.println("Không được nhập chữ");
                flag = true;
            } catch (Exception e) {
                System.out.println("Không đúng định dạng ");
                flag = true;
            }
        } while (flag);
    }
}
