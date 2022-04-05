package com.example;

public class LC11 {

    public int maxArea(int[] height) {
        // two pointers
        // 양쪽 끝에서부터 줄여 나간다
        int numLines = height.length;
        int fullWidth = numLines - 1;
        // 1. 양쪽 끝 인덱스를 잡는다
        int left = 0;
        int right = numLines - 1;
        int max = fullWidth * Math.min(height[0], height[height.length - 1]);
        // 2. max = max(max, width * min(height)) 를 이용해 줄여 나간다
        while (left < right) {
            int leftHeight = height[left];
            int rightHeight = height[right];
            if (leftHeight <= rightHeight) {
                ++left;
            }
            if (leftHeight >= rightHeight) {
                --right;
            }
            int width = right - left;
            max = Math.max(max, width * Math.min(height[left], height[right]));
        }

        return max;
    }

    public static void main(String[] args) {

        int[] height;

        height = new int[]{1,8,6,2,5,4,8,3,7};
        System.out.println(new LC11().maxArea(height));

        height = new int[]{1,1};
        System.out.println(new LC11().maxArea(height));
    }
}
