package org.practice.dynamicprogramming;

import java.util.Arrays;
import java.util.Scanner;

public class FractionalKnapsack {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] vals = new int[n];
        int[] wts = new int[n];

        for (int i = 0; i < n; i++) {
            vals[i] = scn.nextInt();
        }

        for (int i = 0; i < n; i++) {
            wts[i] = scn.nextInt();
        }

        int target = scn.nextInt();

        int[][] items = new int[n][2];
        for (int i = 0; i < n; i++) {
            items[i] = new int[]{vals[i], wts[i]};
        }

        Arrays.sort(items, (o1, o2) -> {
            double v1 = (double) o1[0] / (double) o1[1];
            double v2 = (double) o2[0] / (double) o2[1];

            if (v1 < v2) return 1;
            else if (v1 > v2) return -1;
            else return 0;
        });

        int weight = 0;
        double max = 0.0;

        for (int[] item : items) {
            int value = item[0];
            int wt = item[1];

            if (weight + wt <= target) {
                weight += wt;
                max += value;
            } else {
                double over = target - weight;
                double ratio = (value / (double) wt) * over;

                max += ratio;
                break;
            }
        }

        System.out.println(max);

    }
}
