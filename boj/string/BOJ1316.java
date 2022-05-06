package com.pllap.boj.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1316 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine());
        String[] strings = new String[n];

        int result = 0;
        for (int i = 0; i < n; ++i) {
            char[] chars = bufferedReader.readLine().toCharArray();
            int length = chars.length;
            boolean[] isAppeared = new boolean['z' + 1];
            int j = 0;
            for (j = 0; j < length; ++j) {
                if (isAppeared[chars[j]]) {
                    j += length;
                    break;
                }
                isAppeared[chars[j]] = true;
                while (j < length - 1 && chars[j] == chars[j + 1]) {
                    ++j;
                }
            }

            if (j == length) {
                ++result;
            }
        }

        System.out.println(result);
    }
}
