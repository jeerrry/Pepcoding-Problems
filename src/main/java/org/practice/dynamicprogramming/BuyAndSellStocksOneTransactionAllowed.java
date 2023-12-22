package org.practice.dynamicprogramming;

import java.util.Scanner;

public class BuyAndSellStocksOneTransactionAllowed {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = scn.nextInt();
        }

        int min = nums[0];
        int op = 0;
        int pist = 0;

        for (int i = 1; i < n; i++) {
            if (nums[i] < min) {
                min = nums[i];
            }

            pist = nums[i] - min;
            if (pist > op) {
                op = pist;
            }
        }

        System.out.println(op);
    }
}
