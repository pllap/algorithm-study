package com.pllap.leetcode.dp;

public class LC799 {
    public double champagneTower(int poured, int queryRow, int queryGlass) {

        double[][] glasses = new double[100][100];
        glasses[0][0] = poured;

        for (int row = 1; row <= queryRow; ++row) {
            glasses[row][0] = glasses[row][row] = Math.max((glasses[row - 1][0] - 1) / 2, 0);
            for (int i = 1; i < row; ++i) {
                glasses[row][i] = Math.max((glasses[row - 1][i - 1] - 1) / 2, 0) + Math.max((glasses[row - 1][i] - 1) / 2, 0);
            }
        }

        if (glasses[queryRow][queryGlass] > 1) {
            return 1;
        }

        return glasses[queryRow][queryGlass];
    }

    public static void main(String[] args) {
        System.out.println(new LC799().champagneTower(1, 1, 1));
        System.out.println(new LC799().champagneTower(2, 1, 1));
        System.out.println(new LC799().champagneTower(100, 1, 1));
        System.out.println(new LC799().champagneTower(100000009, 33, 17));
    }
}
