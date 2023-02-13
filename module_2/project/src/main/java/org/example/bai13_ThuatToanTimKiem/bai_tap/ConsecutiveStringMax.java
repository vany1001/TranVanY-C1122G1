package org.example.bai13_ThuatToanTimKiem.bai_tap;

import java.util.LinkedList;
import java.util.Scanner;

public class ConsecutiveStringMax {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LinkedList<Character> linkedList = new LinkedList<>();
        LinkedList<Character> list = new LinkedList<>();

        System.out.print("Nhập chuỗi: ");
        String string = input.nextLine();

        for (int i = 0; i < string.length(); i++) {
            if (list.size() > 1 && string.charAt(i) <= list.getLast() &&
                    list.contains(string.charAt(i))) {
                list.clear();
            }

            list.add(string.charAt(i));

            if (list.size() > linkedList.size()) {
                linkedList.clear();
                linkedList.addAll(list);
            }
        }

        for (Character ch : linkedList) {
            System.out.print(ch);
        }
        System.out.println();
    }
}
