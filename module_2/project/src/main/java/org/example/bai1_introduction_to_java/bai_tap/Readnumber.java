package org.example.bai1_introduction_to_java.bai_tap;

import java.util.Scanner;

public class Readnumber {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter numbers: ");
        int num = scanner.nextInt();

        switch (num) {
            case 0:
                System.out.println("Zero");
                return;
            case 10:
                System.out.println("Ten");
                return;
            case 11:
                System.out.println("Eleven");
                return;
            case 12:
                System.out.println("Twelve");
                return;
            case 13:
                System.out.println("Thirteen");
                return;
            case 14:
                System.out.println("Fourteen");
                return;
            case 15:
                System.out.println("Fifteen");
                return;
            case 16:
                System.out.println("Sixteen");
                return;
            case 17:
                System.out.println("Seventeen");
                return;
            case 18:
                System.out.println("Eighteen");
                return;
            case 19:
                System.out.println("Nineteen");
                return;
        }

        int hangChuc = num / 10;
        int hangDonVi = num % 10;
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


        if(0 <= num && num <=9 ){
            System.out.println(hangDonViString);
        } else if (num % 10 == 0) {
            System.out.println(hangChucString);
        } else {
            System.out.println(hangChucString  + "-" + hangDonViString);
        }


    }

}
