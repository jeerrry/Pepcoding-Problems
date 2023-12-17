package org.practice.dynamicprogramming;

import java.util.Scanner;

public class CountABCSubsequences {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String input = scn.next();

        int a = 0;
        int ab = 0;
        int abc = 0;

        for (int i = 0; i < input.length(); i++) {
            switch (input.charAt(i)) {
                case 'a' -> a = 2 * a + 1;
                case 'b' -> ab = 2 * ab + a;
                case 'c' -> abc = 2 * abc + ab;
            }
        }

        System.out.println(abc);
    }
}
