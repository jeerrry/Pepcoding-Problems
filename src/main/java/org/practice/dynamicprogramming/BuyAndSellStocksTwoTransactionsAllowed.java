package org.practice.dynamicprogramming;

import java.util.Scanner;

public class BuyAndSellStocksTwoTransactionsAllowed {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int[] vals = new int[n];
        for (int i = 0; i < n; i++) {
            vals[i] = scn.nextInt();
        }

        int leastsf = vals[0];
        int[] dpmpisut = new int[n];
        for (int i = 1; i < n; i++) {
            if (vals[i] < leastsf) {
                leastsf = vals[i];
            }

            dpmpisut[i] = Math.max(vals[i] - leastsf, dpmpisut[i - 1]);
        }

        int maxsf = 0;
        int[] mpib = new int[n];
        for (int i = n - 2; i >= 0; i--) {
            if (vals[i] > maxsf) {
                maxsf = vals[i];
            }

            mpib[i] = Math.max(maxsf - vals[i], mpib[i + 1]);
        }

        int result = 0;
        for (int i = 0; i < n; i++) {
            result = Math.max(result, mpib[i] + dpmpisut[i]);
        }

        System.out.println(result);
    }
}
