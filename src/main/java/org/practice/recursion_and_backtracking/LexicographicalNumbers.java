package org.practice.recursion_and_backtracking;

import java.util.*;

public class LexicographicalNumbers {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        //write your code here
        lexicographicalNumbers(n);
    }

    public static void lexicographicalNumbers(int n) {
        for (int i = 1; i <= 9; i++) {
            lexicographicalNumbersHelper(n, i);
        }
    }

    public static void lexicographicalNumbersHelper(int n, int c) {
        if (c > n) return;

        System.out.println(c);
        lexicographicalNumbersHelper(n, c * 10);
        if(c/10==0) return;
        for (int i = 1; i <= 9; i++) {
            if (c + i <= n) {
                System.out.println(c + i);
            }
        }
    }
}
