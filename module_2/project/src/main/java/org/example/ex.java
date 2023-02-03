package org.example;

//public class ex {
//    public static void main(String[] args) {
//        int[] arr = {1, 5, 4, 2, 9, 7};
//
////        for (int i = 0; i < arr.length; i++) {
////            System.out.println(arr[i]);
////        }
////        System.out.println("//");
////        for (int i = arr.length-1;i >= 0; i--) {
////            System.out.println(arr[i]);
////        }
////        int i = 0;
////        do {
////            System.out.println(arr[i]);
////            i++;
////        } while (i < arr.length);
//
//        String[] ar = {"y", "van", "tran"};
//        for (String element : ar) {
//            System.out.println(element);
//        }
//
//    }

    public class ex {
        public static void main(String[] args) {
            try {
                int x = 0;
                int y = 5 / x;
            }catch (ArithmeticException e) {
                System.out.println("Arithmetic");
            }catch (Exception ae) {
                System.out.println("Exception");
            }
            System.out.println("finished");
        }
    }
