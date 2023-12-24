package org.practice.dynamicprogramming;

import java.util.Scanner;

public class BuyAndSellStocksWithTransactionFeeInfiniteTransactionsAllowed {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] vals = new int[n];
        for (int i = 0; i < n; i++) {
            vals[i] = scn.nextInt();
        }
        int fee = scn.nextInt();

        int obsp = -vals[0];
        int ossp = 0;

        for (int i = 1; i < n; i++) {
            obsp = Math.max(ossp - vals[i], obsp);
            ossp = Math.max(obsp + vals[i] - fee, ossp);
        }

        System.out.println(ossp);
    }
}
