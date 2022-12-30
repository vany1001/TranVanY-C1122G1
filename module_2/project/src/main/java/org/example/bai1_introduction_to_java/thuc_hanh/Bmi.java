package org.example.bai1_introduction_to_java.thuc_hanh;

import java.util.Scanner;

public class Bmi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("nhập cân nặng: ");
        float weight = scanner.nextFloat();

        System.out.print("nhập chiều cao: ");
        float height = scanner.nextFloat();

        float bmi = weight / (height * height);

        if(bmi < 18.5){
            System.out.println("Underweight");
        }else if (bmi < 25 ){
            System.out.println("Normal");
        }else if (bmi <30){
            System.out.println("Overweight");
        }else if(bmi >= 30){
            System.out.println("Obese");
        }
    }
}
