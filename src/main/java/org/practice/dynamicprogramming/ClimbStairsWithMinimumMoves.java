package org.practice.dynamicprogramming;

import java.util.Scanner;

public class ClimbStairsWithMinimumMoves {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int steps = scn.nextInt();

        int[] cost = new int[steps + 1];
        for (int i = 0; i < steps; i++) {
            cost[i] = scn.nextInt();
        }

        Integer[] result = new Integer[steps + 1];
        result[steps] = 0;

        for (int i = steps - 1; i >= 0; i--) {
            int moves = cost[i];
            for (int j = 1; j <= moves; j++) {
                if (i + j > steps) continue;
                if(result[i + j] == null) continue;

                if(result[i] == null) {
                    result[i] = result[i + j] + 1;
                }else {
                    result[i] = Math.min(result[i], result[i + j] + 1);
                }
            }
        }

        System.out.println(result[0]);
    }
}
