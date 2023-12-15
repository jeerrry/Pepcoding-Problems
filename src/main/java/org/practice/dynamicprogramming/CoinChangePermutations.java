package org.practice.dynamicprogramming;

import java.util.Scanner;

public class CoinChangePermutations {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] coins = new int[n];
        for (int i = 0; i < n; i++) {
            coins[i] = scn.nextInt();
        }
        int target = scn.nextInt();

        int[] dp = new int[target + 1];
        dp[0] = 1;
        for (int i = 1; i <= target; i++) {
            for (int coin : coins) {
                if(i < coin) continue;

                dp[i] += dp[i - coin];
            }
        }

        System.out.println(dp[target]);
    }
}
