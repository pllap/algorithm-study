package com.pllap.leetcode.dp;

public class LC1359 {

    public int countOrders(int n) {
        long[] mem = new long[n + 1];
        mem[1] = 1L;
        for (int i = 2; i < n + 1; ++i) {
            mem[i] = (i * (2L * i - 1) * mem[i - 1]) % 1000000007;
        }

        return (int) mem[n];
    }

    public static void main(String[] args) {
        System.out.println(new LC1359().countOrders(1));
        System.out.println(new LC1359().countOrders(2));
        System.out.println(new LC1359().countOrders(3));
        System.out.println(new LC1359().countOrders(7)); // 681080400
        System.out.println(new LC1359().countOrders(18)); // 368349166
    }
}
