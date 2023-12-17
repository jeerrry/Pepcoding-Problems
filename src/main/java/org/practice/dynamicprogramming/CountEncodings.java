package org.practice.dynamicprogramming;

import java.util.Scanner;

public class CountEncodings {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String input = scn.next();

        if (input.length() <= 1) {
            System.out.println(input.length());
            return;
        }

        int[] dp = new int[input.length()];
        dp[0] = 1;

        for (int i = 1; i < input.length(); i++) {
            char pc = input.charAt(i - 1);
            char cc = input.charAt(i);

            if (pc == '0' && cc == '0') {
                dp[i] = 0;
            } else if (pc == '0') {
                dp[i] = dp[i - 1];
            } else if (cc == '0') {
                if (pc == '1' || pc == '2') {
                    dp[i] = i >= 2 ? dp[i - 2] : 1;
                } else {
                    dp[i] = 0;
                }
            } else {
                dp[i] += dp[i - 1];
                if (Integer.parseInt(input.substring(i - 1, i + 1)) > 26) continue;

                dp[i] += i >= 2 ? dp[i - 2] : 1;
            }
        }

        System.out.println(dp[input.length() - 1]);
    }
}
