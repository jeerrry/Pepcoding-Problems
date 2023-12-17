package org.practice.dynamicprogramming;

import java.util.Scanner;

public class ArrangeBuildings {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        if (n == 0) {
            System.out.println("0");
            return;
        }

        int a = 1;
        int b = 1;
        for (int i = 2; i <= n; i++) {
            int temp = b;
            b = a + b;
            a = temp;
        }

        int result = a + b;
        System.out.println(result * result);
    }
}
