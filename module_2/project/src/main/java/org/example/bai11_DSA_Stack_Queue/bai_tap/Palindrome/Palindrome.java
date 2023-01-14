package org.example.bai11_DSA_Stack_Queue.bai_tap.Palindrome;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        System.out.print("Nhập vào chuỗi cần kiểm tra: ");
        Scanner in = new Scanner(System.in);
        String inputString = in.nextLine();
        Queue<Character> queue = new LinkedList<>();
        for (int i = inputString.length() - 1; i >= 0; i--) {
            queue.add(inputString.charAt(i));
        }
        String reverseString = "";
        while (!queue.isEmpty()) {
            reverseString = reverseString + queue.remove();
        }
        if (inputString.equals(reverseString))
            System.out.println("Đây là chuỗi đối xứng.");
        else
            System.out.println("Đây không phải là chuỗi đối xứng.");
    }
}
