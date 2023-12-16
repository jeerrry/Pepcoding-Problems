package org.practice.dynamicprogramming;

import java.util.Scanner;

public class ZeroOneKnapsack {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] vals = new int[n];
        int[] wts = new int[n];

        for (int i = 0; i < n; i++) {
            vals[i] = scn.nextInt();
        }

        for (int i = 0; i < n; i++) {
            wts[i] = scn.nextInt();
        }

        int target = scn.nextInt();
        int[][] dp = new int[n + 1][target + 1];

        int max = 0;
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= target; j++) {
                if (i == 0 || j == 0) {
                    dp[i][j] = 0;
                } else {
                    int val = vals[i - 1];
                    int wt = wts[i - 1];

                    if (j >= wt) {
                        dp[i][j] = Math.max(dp[i - 1][j], val + dp[i - 1][j - wt]);
                        max = Math.max(max, dp[i][j]);
                    } else {
                        dp[i][j] = dp[i - 1][j];
                    }
                }
            }
        }

        System.out.println(max);
    }
}
