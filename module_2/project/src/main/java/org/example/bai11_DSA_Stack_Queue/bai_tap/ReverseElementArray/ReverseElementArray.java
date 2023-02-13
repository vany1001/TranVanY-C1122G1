package org.example.bai11_DSA_Stack_Queue.bai_tap.ReverseElementArray;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class ReverseElementArray {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number;
        do {
            System.out.print("Nhập số phần tử của mảng: ");
            number = Integer.parseInt(scanner.nextLine());
            if (number < 0) {
                System.out.print("Số phần tử không hợp lệ: ");
            }
        } while (number < 0);

        int[] arr = new int[number];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("nhâp phần tử thứ " + (i + 1) + ":");
            arr[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("Mảng đã nhập là: " + Arrays.toString(arr));

        Stack<Integer> stack = new Stack<>();
        Stack<Integer> stack1 = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
            stack.push(arr[i]);
        }

        while (!stack.isEmpty()) {
            stack1.push(stack.pop());
        }
        System.out.println("Mảng dảo ngược là: " + stack1);

        System.out.println("________//________");

        Stack<String> stack2 = new Stack<>();
        System.out.print("Nhập chuỗi bất kì: ");
        String string = scanner.nextLine();

        String[] arr1 = string.split("");
        System.out.println(Arrays.toString(arr1));

        for (String item : arr1) {
            stack2.push(item);
        }
        string = "";
        while (!stack2.isEmpty()) {
            string += stack2.pop() + "";
        }
        System.out.println("Chuỗi đảo ngược là: " + string);
    }
}
