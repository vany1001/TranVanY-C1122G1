package org.example.bai2.test;

public class TestFor {
    public static void main(String[] args) {
//    hcn
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 5; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }


//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j < i +1; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }


//        int temp = 5;
//        for (int i = 0; i < 5; i++) {
//
//            for (int j = 0; j < temp; j++) {
//                System.out.print("* ");
//            }
//
//            temp--;
//            System.out.println();
//        }

//        for (int i = 0; i < 5; i++) {
//
//            for (int j = 0; j < (5-i); j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

//        for (int i = 5; i > 0; i--) {
//
//            for (int j = 0; j < i; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
        int temp = 4;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (j < temp) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }

            }
            temp--;
            System.out.println();
        }


    }
}
