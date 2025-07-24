package org.practice.bitmanipulation;

import java.util.Scanner;

public class PrintValueOfRsbMask {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int mask = (~n) + 1;
        System.out.println(Integer.toBinaryString(n & mask));
    }
}

