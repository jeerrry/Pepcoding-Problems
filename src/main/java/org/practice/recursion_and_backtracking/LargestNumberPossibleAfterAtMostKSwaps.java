package org.practice.recursion_and_backtracking;

import java.util.*;

public class LargestNumberPossibleAfterAtMostKSwaps {
    static String max;

    public static void findMaximum(String str, int k) {
        //write your code here
        if (k == 0) {
            return;
        }

        for (int i = 0; i < str.length() - 1; i++) {
            char ith = str.charAt(i);
            for (int j = i + 1; j < str.length(); j++) {
                char jth = str.charAt(j);
                if (jth < ith) continue;

                String result = swap(str, i, j);
                max = String.valueOf(Math.max(Integer.parseInt(max), Integer.parseInt(result)));
                findMaximum(result, k - 1);
            }
        }
    }

    public static String swap(String str, int i, int j) {
        char ith = str.charAt(i);
        char jth = str.charAt(j);

        return str.substring(0, i) + jth + str.substring(i + 1, j) + ith + str.substring(j + 1);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        int k = scn.nextInt();
        max = str;
        findMaximum(str, k);
        System.out.println(max);
    }
}
