package org.example.bai10_DSA_danhsach.bai6_ke_thua.bai_tap.Point;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {

        Point3D point3D = new Point3D(3, 5, 6);

        System.out.println(point3D.toString());
        System.out.println();
        System.out.println(Arrays.toString(point3D.getXY()));
        System.out.println(Arrays.toString(point3D.getXYZ()));

    }

}
