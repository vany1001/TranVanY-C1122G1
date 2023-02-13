package org.example.bai3_array.bai_tap;

import java.util.Scanner;

public class IargestArrayElement {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("nhập số dòng của ma trận: ");
        int m = Integer.parseInt(scanner.nextLine());


        System.out.print("nhập số cột của ma trận: ");
        int n = Integer.parseInt(scanner.nextLine());

        int arr[][] = new int[m][n];
        System.out.printf("Nhập các phần tử cho ma trận: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("A[" + i + "][" + j + "] = ");
                arr[i][j] = Integer.parseInt(scanner.nextLine());

            }
        }
        int max = arr[0][0];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (max < arr[i][j]) {
                    max = arr[i][j];
                }

            }

        }
        int mMax;
        int nMax;

        int index = arr[0][0];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] == max) {
                    mMax = i;
                    nMax = j;
                    System.out.println("Vậy số lớn nhất là " + max + " ở vị trí array[" + mMax + "][" + nMax + "]");
                }

            }
        }


    }
}
