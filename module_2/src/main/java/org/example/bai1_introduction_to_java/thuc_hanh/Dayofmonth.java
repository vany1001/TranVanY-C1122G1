package org.example.bai1_introduction_to_java.thuc_hanh;

import java.util.Scanner;

public class Dayofmonth {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("nhâp tháng: ");
        int month = scanner.nextInt();

        switch (month) {
            case 2:
              System.out.print("tháng 2 có 28 hoặc 29 ngày");
              break;

            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.printf("tháng %d có 31 ngày " , month);
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.printf("tháng %d có 30 ngày ", month);
                break;
            default:
                System.out.printf("Tháng %d không hợp lệ.", month);


        }
    }
}
