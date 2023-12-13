package org.practice.dynamicprogramming;

import java.util.*;

public class Fabonacci {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] result = new int[n + 1];
        result[0] = 0;
        result[1] = 1;

        for (int i = 2; i <= n; i++) {
            result[i] = result[i - 1] + result[i - 2];
        }

        System.out.println(result[n]);
    }
}
