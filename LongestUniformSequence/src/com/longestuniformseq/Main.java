package com.longestuniformseq;

public class Main {

    public static void main(String[] args) {
        System.out.println(longestUniformSequence(new int[]{1, 1, 2, 2, 2, 3})); // 3
        System.out.println(longestUniformSequence(new int[]{5, 5, 5, 5, 5})); // 5
        System.out.println(longestUniformSequence(new int[]{1, 2, 3, 4})); // 1
        System.out.println(longestUniformSequence(new int[]{7})); // 1
        System.out.println(longestUniformSequence(new int[]{3, 3, 3, 2, 2, 2, 2, 1})); // 4
    }

    public static int longestUniformSequence(int[] A) {
        if (A == null || A.length == 0) {
            return 0;
        }

        int maxLength = 1;
        int currentLength = 1;

        for (int i = 1; i < A.length; i++) {
            if (A[i] == A[i - 1]) {
                currentLength++;
            } else {
                maxLength = Math.max(maxLength, currentLength);
                currentLength = 1;
            }
        }

        // Final check in case the longest sequence is at the end
        return Math.max(maxLength, currentLength);
    }
}
