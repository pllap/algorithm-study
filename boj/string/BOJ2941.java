package com.pllap.boj.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2941 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String line = bufferedReader.readLine();
        char[] chars = line.toCharArray();
        int length = chars.length;

        int result = 0;
        for (int i = 0; i < length; ++i) {
            ++result;

            if (i < length - 2 && chars[i] == 'd' && chars[i + 1] == 'z' && chars[i + 2] == '=') {
                i += 2;
                continue;
            }
            if (i < length - 1) {
                if (chars[i] == 'c' && (chars[i + 1] == '=' || chars[i + 1] == '-') ||
                        chars[i] == 'd' && chars[i + 1] == '-' ||
                        chars[i] == 'l' && chars[i + 1] == 'j' ||
                        chars[i] == 'n' && chars[i + 1] == 'j' ||
                        chars[i] == 's' && chars[i + 1] == '=' ||
                        chars[i] == 'z' && chars[i + 1] == '=') {
                    ++i;
                }
            }
        }

        System.out.println(result);
    }
}
