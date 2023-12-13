package org.practice.dynamicprogramming;

import java.util.*;

public class ClimbStairs {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int stairs = scn.nextInt();
        int[] result = new int[stairs + 1];
        result[0] = 1;

        for (int i = 1; i < stairs + 1; i++) {
            int count = 0;
            for (int j = 1; j <= 3; j++) {
                if(i - j >= 0) {
                    count += result[i - j];
                }
            }

            result[i] = count;
        }

        System.out.println(result[stairs]);
    }
}
