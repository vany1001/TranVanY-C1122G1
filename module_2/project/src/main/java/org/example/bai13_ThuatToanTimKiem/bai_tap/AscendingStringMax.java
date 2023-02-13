package org.example.bai13_ThuatToanTimKiem.bai_tap;

import java.util.LinkedList;
import java.util.Scanner;

public class AscendingStringMax {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nhập chuỗi: ");
        String string = input.nextLine();

        LinkedList<Character> linkedList = new LinkedList<>();


        for (int i = 0; i < string.length(); i++) {
            LinkedList<Character> list = new LinkedList<>();
            list.add(string.charAt(i));
            for (int j = i + 1; j < string.length(); j++) {
                if (string.charAt(j) > list.getLast()) {
                    list.add(string.charAt(j));
                }
            }

            if (list.size() > linkedList.size()) {
                linkedList.clear();
                    linkedList.addAll(list);
            }
            list.clear();
        }

        for (Character ch : linkedList) {
            System.out.print(ch);
        }
        System.out.println();
    }
}
