package org.example.bai15_XuLiNgoaiLe_Debug.bai_tap;

import java.util.Scanner;

public class Triangle {
    public void checkTriangle(double a, double b, double c) throws IllegalTriangleException {
        if (a < 0 || b < 0 || c < 0) {
            throw new IllegalTriangleException("Lỗi: Cạnh tam giác không thể là số âm");
        } else if (a + b <= c || a + c <= b || b + c <= a) {
            throw new IllegalTriangleException("Lỗi: Tam giác không hợp lệ ");
        } else {
            System.out.println("Tam giác hợp lệ \n" +
                    "Kết thúc chương trình");
        }
    }
}
