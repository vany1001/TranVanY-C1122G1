package org.example.bai3_array.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class MinArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        do {
            System.out.print("Nhập chiều dài của mảng: ");
            size = Integer.parseInt(scanner.nextLine());
            if (size <= 0) {
                System.out.println("Nhập lại chiều dài của mảng: ");
            }

        } while (size < 0);

        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("nhâp phần tử thứ " + (i + 1) + ":");
            arr[i] = Integer.parseInt(scanner.nextLine());

        }
        System.out.println("Mảng đã nhập là: " + Arrays.toString(arr));

        int min = arr[0];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
                index=i;
            }


        }
        System.out.println("Gía trị nhỏ nhất của mảng là: "+ min + " tại vị trí " + index );



    }
}
