package org.practice.dynamicprogramming;

import java.util.*;

public class ClimbStairsWithVariableJumps {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int stairs = scn.nextInt();
        int[] jump = new int[stairs + 1];
        for (int i = 0; i < stairs; i++) {
            jump[i] = scn.nextInt();
        }

        int[] result = new int[stairs + 1];
        result[stairs] = 1;
        for (int i = stairs; i >= 0; i--) {
            int pj = jump[i];
            for (int j = 1; j <= pj; j++) {
                if (i + j <= stairs) {
                    result[i] += result[i + j];
                }
            }
        }

        System.out.println(result[0]);
    }
}
