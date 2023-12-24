package org.practice.dynamicprogramming;

import java.util.Scanner;

public class BuyAndSellStocksWithCooldownInfiniteTransactionAllowed {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] vals = new int[n];
        for (int i = 0; i < n; i++) {
            vals[i] = scn.nextInt();
        }

        int obsp = -vals[0];
        int ossp = 0;
        int ocsp = 0;

        for (int i = 1; i < n; i++) {
            int nbsp = Math.max(ocsp - vals[i], obsp);
            int nssp = Math.max(obsp + vals[i], ossp);
            int ncsp = Math.max(ossp, ocsp);

            obsp = nbsp;
            ossp = nssp;
            ocsp = ncsp;
        }

        System.out.println(ossp);
    }
}
