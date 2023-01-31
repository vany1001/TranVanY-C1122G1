package org.example.bai10_DSA_danhsach.bai6_ke_thua.bai_tap.PointMoveablePoint;

public class Point {
    private float x = 0.0f;
    private float y = 0.0f;

    public Point() {

    }
    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float[] getXY() {
        float[] arr = {x, y};
        return arr;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x = " + x +
                ", y = " + y +
                '}';
    }

    public static void main(String[] args) {

        Point point = new Point(20,7.7f);
        System.out.println(point);
    }


}
