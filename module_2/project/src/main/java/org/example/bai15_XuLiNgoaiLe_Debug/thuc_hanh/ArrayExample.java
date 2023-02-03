package org.example.bai15_XuLiNgoaiLe_Debug.thuc_hanh;

import javax.sound.midi.Soundbank;
import java.util.Random;
import java.util.Scanner;
import java.util.SortedMap;

public class ArrayExample {

    public Integer[] createRandom() {
        Random rd = new Random();
        Integer[] arr = new Integer[20];
        System.out.println("Danh sách phần tử của mảng: ");
        for (int i = 0; i < 20; i++) {
            arr[i] = rd.nextInt(20);
            System.out.print(arr[i] + " ");
        }
        return arr;

    }

    public static void main(String[] args) {
        ArrayExample arrayExample = new ArrayExample();
        Integer[] arr = arrayExample.createRandom();

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nnhap chi so cua mang: ");
        int x = Integer.parseInt(scanner.nextLine());

        try {
            System.out.print("Giá trị của phần tử có chỉ số " + x + " là " + arr[x]);

        } catch (IndexOutOfBoundsException e) {
            System.err.println("Chỉ số vượt quá giới hạn của mảng");

        }




    }

}
