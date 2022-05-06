package com.pllap.boj.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ5622 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        char[] alphaToNum = new char['Z' + 1];
        alphaToNum['A'] = alphaToNum['B'] = alphaToNum['C'] = 3;
        alphaToNum['D'] = alphaToNum['E'] = alphaToNum['F'] = 4;
        alphaToNum['G'] = alphaToNum['H'] = alphaToNum['I'] = 5;
        alphaToNum['J'] = alphaToNum['K'] = alphaToNum['L'] = 6;
        alphaToNum['M'] = alphaToNum['N'] = alphaToNum['O'] = 7;
        alphaToNum['P'] = alphaToNum['Q'] = alphaToNum['R'] = alphaToNum['S'] = 8;
        alphaToNum['T'] = alphaToNum['U'] = alphaToNum['V'] = 9;
        alphaToNum['W'] = alphaToNum['X'] = alphaToNum['Y'] = alphaToNum['Z'] = 10;

        int time = 0;
        String line = bufferedReader.readLine();
        for (char c : line.toCharArray()) {
            time += alphaToNum[c];
        }
        System.out.println(time);
    }
}
