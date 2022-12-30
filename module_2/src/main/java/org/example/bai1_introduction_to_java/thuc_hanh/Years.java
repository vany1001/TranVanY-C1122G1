package org.example.bai1_introduction_to_java.thuc_hanh;

import java.util.Scanner;

public class Years {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhập năm: ");
        int year = scanner.nextInt();

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.printf("Năm %d là năm nhuận", year);
                } else {
                    System.out.printf("Năm %d không phải là năm nhuận", year);
                }
            } else {
                System.out.printf("Năm %d là năm nhuận", year);
            }
        } else {
            System.out.printf("Năm %d không phải là năm nhuận", year);
            }
        }

        }

