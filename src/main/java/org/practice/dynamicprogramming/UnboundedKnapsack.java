package org.practice.dynamicprogramming;

import java.util.Scanner;

public class UnboundedKnapsack {
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

        int max = 0;
        int target = scn.nextInt();
        int[] dp = new int[target + 1];
        dp[0] = 0;

        for (int i = 0; i < n; i++) {
            int val = vals[i];
            int wt = wts[i];

            for (int j = 1; j <= target; j++) {
                if (j < wt) continue;
                dp[j] = Math.max(val + dp[j - wt], dp[j]);
                max = Math.max(max, dp[j]);
            }
        }

        System.out.println(max);
    }
}
