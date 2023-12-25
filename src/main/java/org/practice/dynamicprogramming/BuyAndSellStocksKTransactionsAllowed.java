package org.practice.dynamicprogramming;

import java.util.Scanner;

public class BuyAndSellStocksKTransactionsAllowed {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] vals = new int[n];
        for (int i = 0; i < n; i++) {
            vals[i] = scn.nextInt();
        }
        int k = scn.nextInt();

        int[][] dp = new int[k + 1][n];
        for (int t = 1; t <= k; t++) {
            for (int d = 1; d < n; d++) {
                dp[t][d] = dp[t][d - 1];
                for (int pd = 0; pd < d; pd++) {
                    int ptilltm1 = dp[t - 1][pd];
                    int pth = vals[d] - vals[d - 1];

                    dp[t][d] = Math.max(dp[t][d], ptilltm1 + pth);
                }
            }
        }

        System.out.println(dp[k][n - 1]);
    }
}
