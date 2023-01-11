package org.example.bai8_CleanCode_Refactoring.bai_tap;

import static org.example.bai8_CleanCode_Refactoring.bai_tap.TennisGame.getScore;

public class TennisGameMain {
    public static void main(String[] args) {
        String result = getScore(60, 65);
        System.out.println(result);
    }
}
