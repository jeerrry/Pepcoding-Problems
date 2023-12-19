package org.practice.dynamicprogramming;

import java.util.Scanner;

public class PaintFence {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int k = scn.nextInt();

        int diff = k;
        int total = k;

        for (int i = 1; i < n; i++) {
            int same = diff;
            diff = total * (k - 1);
            total = (same + diff);
        }

        System.out.println(total);
    }
}
