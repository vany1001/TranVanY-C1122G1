package org.example.bai19_String_Regex.bai_tap;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatePhone {

    private static final String PHONE_NUMBER = "^[(]\\d{2}[)][-][(][0]\\d{9}[)]$";

    public static void main(String[] args) {
        System.out.print("Nhập số: ");
        Scanner scanner = new Scanner(System.in);
        String phone = scanner.nextLine();
        Pattern pattern = Pattern.compile(PHONE_NUMBER);
        Matcher matcher = pattern.matcher(phone);
        System.out.println(matcher.matches());
    }
}
