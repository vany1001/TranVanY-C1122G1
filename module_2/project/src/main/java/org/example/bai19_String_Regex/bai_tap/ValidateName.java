package org.example.bai19_String_Regex.bai_tap;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateName {

    private static final String REGEX_NAME = "^[C|A|P]\\d{4}[G|H|I|K|L|M]$";

    public static void main(String[] args) {

        System.out.print("Nhập tên lớp: ");
        Scanner scanner = new Scanner(System.in);
        String cla = scanner.nextLine();
        Pattern pattern = Pattern.compile(REGEX_NAME);
        Matcher matcher = pattern.matcher(cla);
        System.out.println(matcher.matches());


    }




}
