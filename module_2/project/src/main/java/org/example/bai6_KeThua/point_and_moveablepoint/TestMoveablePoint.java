package org.example.bai6_KeThua.point_and_moveablepoint;

public class TestMoveablePoint {
    public static void main(String[] args) {
        MoveablePoint mvp = new MoveablePoint();
        System.out.println(mvp);

        mvp = new MoveablePoint(10.5f,4,32.5f,12.8f);
        System.out.println(mvp);
    }
}
