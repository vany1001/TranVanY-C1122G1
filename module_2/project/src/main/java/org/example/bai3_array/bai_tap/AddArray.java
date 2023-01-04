package org.example.bai3_array.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class AddArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[4];
        int[] arr1 = new int[5];
        //
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Nhập phần tử thứ " + (i+1) + ": ");
            arr[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println(Arrays.toString(arr));

        System.out.print("nhâp số cần chèn: ");
        int number = Integer.parseInt(scanner.nextLine());

        System.out.print("Nhập vị trí cần chèn: ");
        int index = Integer.parseInt(scanner.nextLine());

        if (index < 0 || index > arr.length) {
            System.out.println("không chèn được phần tử vào mảng");
        } else{
            for (int i = 0; i < 5; i++) {
                if(index == i){
                    arr1[i] = number;
                } else if (index > i) {
                    arr1[i] = arr[i];
                } else {
                    arr1[i] = arr[i - 1];
                }

            }
            System.out.println("Mảng đã chèn phần tử vào là: " + Arrays.toString(arr1));
        }
        }

}
