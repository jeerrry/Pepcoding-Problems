package org.practice.dynamicprogramming;

import org.javatuples.Pair;

import java.util.Scanner;
import java.util.function.Function;

public class PaintHouseManyColors {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int k = scn.nextInt();

        int[][] paint = new int[n][k];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < k; j++) {
                paint[i][j] = scn.nextInt();
            }
        }

        int min = Integer.MAX_VALUE;
        int smin = min;
        for (int i = 0; i < k; i++) {
            int current = paint[0][i];
            if (current < min) {
                smin = min;
                min = current;
            } else if (current < smin) {
                smin = current;
            }
        }

        for (int i = 1; i < n; i++) {
            int lmin = Integer.MAX_VALUE;
            int lsmin = lmin;
            for (int j = 0; j < k; j++) {
                if (min == paint[i][j]) {
                    paint[i][j] += smin;
                } else {
                    paint[i][j] += min;
                }

                if (paint[i][j] < lmin) {
                    lsmin = lmin;
                    lmin = paint[i][j];
                } else if (paint[i][j] < lsmin) {
                    lsmin = paint[i][j];
                }
            }

            min = lmin;
            smin = lsmin;
        }

        int result = Integer.MAX_VALUE;
        for (int i = 0; i < k; i++) {
            result = Math.min(result, paint[n - 1][i]);
        }

        System.out.println(result);
    }
}
