package org.practice.dynamicprogramming;

import java.util.Scanner;

public class BuyAndSellStocksInfiniteTransactionsAllowed {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = scn.nextInt();
        }

        int buy = nums[0];
        int sell = nums[0];
        int psf = 0;

        for (int i = 1; i < n; i++) {
            if (nums[i] > sell) {
                sell = nums[i];
            } else {
                psf += (sell - buy);
                buy = sell = nums[i];
            }
        }

        System.out.println(psf);
    }
}
