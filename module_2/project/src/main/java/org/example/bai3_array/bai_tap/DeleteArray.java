package org.example.bai3_array.bai_tap;

import org.example.bai3_array.test.DemoCallMethod;

import java.util.Arrays;
import java.util.Scanner;

public class DeleteArray {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        // nhập giá trị x japoojdpao để làm cái chi đó. ....
        // nhập vào nếu xxx thì yyy
        do {
            System.out.print("Nhập số phần tử của mảng: ");
            number = Integer.parseInt(scanner.nextLine());
            if (number < 0) {
                System.out.print("Số phần tử không hợp lệ: ");
            }
        } while (number < 0);

        int[] arr = new int[number];
//        int k = 0;
//        while (k < arr.length) {
//            System.out.print("Nhập phần tử thứ " + (k + 1) + ": ");
//            arr[k] = Integer.parseInt(scanner.nextLine());
//            k++;
//        }
        for (int k = 0;k < arr.length; k++) {
            System.out.print("Nhập phần tử thứ " + (k + 1) + ": ");
            arr[k] = Integer.parseInt(scanner.nextLine());

        }

        System.out.println("Mảng vừa nhập là: " + Arrays.toString(arr));
        System.out.println("Mảng vừa nhập là: " + DemoCallMethod.toStringOfY(arr));

        System.out.print("Nhâp số nguyên X cần xóa: ");
        int numberDelete = Integer.parseInt(scanner.nextLine());

//        for (int i = 0; i < arr.length; i++) {
//            if (x == arr[i]) {
//                System.out.println(x + ":" + i);
//                for (int j = i; j < number-1; j++) {
//                    arr[j] = arr[j + 1];
//                }
//                arr[number-1] = 0;
//                i--;
//            }
//
//        }
//        System.out.println(Arrays.toString(arr));
        int indexNumberDelete = 0;
        for (int i = 0; i < arr.length; i++) {
            if (numberDelete == arr[i]) {
//                System.out.println("index of numberDelete: " + i);
                indexNumberDelete = i;
            }
        }
//        System.out.println(indexNumberDelete);

        for (int i = indexNumberDelete; i < arr.length; i++) {

            if (i == arr.length - 1) {

                arr[i] = 0;
            } else {
                arr[i] = arr[i + 1];

            }

        }
        System.out.println(Arrays.toString(arr));
    }

}
