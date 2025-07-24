package org.practice.bitmanipulation;

import java.util.Scanner;

public class KernighansAlgorithm {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int ans = 0;
        while(n != 0) {
            n -= (n & -n);
            ans++;
        }

        System.out.println(ans);
    }
}
