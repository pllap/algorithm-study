package com.pllap.boj.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2908 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] tokens = bufferedReader.readLine().split(" ");
        System.out.println(Math.max(
                Integer.parseInt(new StringBuffer(tokens[0]).reverse().toString()),
                Integer.parseInt(new StringBuffer(tokens[1]).reverse().toString())));
    }
}
