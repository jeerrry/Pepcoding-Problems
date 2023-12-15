package org.practice.dynamicprogramming;

import java.util.Scanner;

public class TargetSumSubsets {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = scn.nextInt();
        }
        int tar = scn.nextInt();

        boolean[][] dp = new boolean[n + 1][tar + 1];
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                if (i == 0 && j == 0) {
                    dp[i][j] = true;
                } else if (i == 0) {
                    dp[i][j] = false;
                } else if (j == 0) {
                    dp[i][j] = true;
                } else {
                    dp[i][j] = dp[i - 1][j];
                    if(dp[i][j]) continue;
                    int val = nums[i - 1];
                    if(j < val) continue;
                    dp[i][j] = dp[i - 1][j - val];
                }
            }
        }

        System.out.println(dp[n][tar]);
    }
}
