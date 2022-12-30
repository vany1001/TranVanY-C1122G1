package org.example.bai1_introduction_to_java.bai_tap;

import java.util.Scanner;

public class Money {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số USD: ");
        int USD = scanner.nextInt();
         int rate = 23000* USD;
        System.out.printf("Số tiền VND là: " + rate);
    }
}
