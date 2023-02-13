package org.example.bai1_introduction_to_java.bai_tap;

import java.util.Scanner;

public class DoiSoThanhChu {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số: ");
        int num = Integer.parseInt(scanner.nextLine());

        if (num == 0) {
            System.out.println("Zero");
        } else if (10 <= num && num <= 19) {
            switch (num) {
                case 10:
                    System.out.println("Ten");
                    break;
                case 11:
                    System.out.println("Eleven");
                    break;
                case 12:
                    System.out.println("Twelve");
                    break;
                case 13:
                    System.out.println("Thirteen");
                    break;
                case 14:
                    System.out.println("Fourteen");
                    break;
                case 15:
                    System.out.println("Fifteen");
                    break;
                case 16:
                    System.out.println("Sixteen");
                    break;
                case 17:
                    System.out.println("Seventeen");
                    break;
                case 18:
                    System.out.println("Eighteen");
                    break;
                case 19:
                    System.out.println("Nineteen");
                    break;
            }
        } else {

            int hangChuc = num / 10; // chia lấy số nguyên tức là hàng chục
            int hangDonVi = num % 10; // chia lấy dư tức hàng đơn vị

            String hangChucString = "";
            String hangDonViString = "";

            switch (hangChuc) {
                case 2:
                    hangChucString = "Twenty";
                    break;
                case 3:
                    hangChucString = "Thirty";
                    break;
                case 4:
                    hangChucString = "Forty";
                    break;
                case 5:
                    hangChucString = "Fifty";
                    break;
                case 6:
                    hangChucString = "Sixty";
                    break;
                case 7:
                    hangChucString = "Seventy";
                    break;
                case 8:
                    hangChucString = "Eighty";
                    break;
                case 9:
                    hangChucString = "Ninety";
            }

            switch (hangDonVi) {
                case 1:
                    hangDonViString = "One";
                    break;
                case 2:
                    hangDonViString = "Two";
                    break;
                case 3:
                    hangDonViString = "Three";
                    break;
                case 4:
                    hangDonViString = "Four";
                    break;
                case 5:
                    hangDonViString = "Five";
                    break;
                case 6:
                    hangDonViString = "Six";
                    break;
                case 7:
                    hangDonViString = "Seven";
                    break;
                case 8:
                    hangDonViString = "Eight";
                    break;
                case 9:
                    hangDonViString = "Nine";
                    break;
            }

            // chỉ in ra 1 số hàng đơn vị
            if (0 <= num && num <= 9) {
                System.out.println(hangDonViString);
            }
            // Số chẵn thì chỉ in ra hàng chục
            else if (num % 10 == 0) {
                System.out.println(hangChucString);
            }
            // vừa có hàng chục và hàng đơn vị
            else {
                System.out.println(hangChucString + "-" + hangDonViString);
            }

        }

    }

}
