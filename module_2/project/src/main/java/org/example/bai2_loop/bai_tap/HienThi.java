package org.example.bai2_loop.bai_tap;

public class HienThi {
    public static void main(String[] args) {

//        in hinh chu nhat
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

// In hình tam giác vuông, có cạnh góc vuông ở botton-left


        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

//        In hình tam giác vuông, có cạnh góc vuông ở top-left

        for (int i = 5; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

//        in hình tam giac can
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5 + i; j++) {
                if (j < 5 - i - 1) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
