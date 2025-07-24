package org.practice.bitmanipulation;

import java.util.Scanner;

public class JosephusSpecial {
    public static int solution(int n) {
        int val = 1;
        while (val * 2 <= n) val *= 2;

        int l = n - val;

        return 2*l  + 1;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        System.out.println(solution(n));
    }
}
