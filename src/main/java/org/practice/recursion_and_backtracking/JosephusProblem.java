package org.practice.recursion_and_backtracking;

import java.util.*;

public class JosephusProblem {
    public static int solution(int n, int k) {
        if (n == 1) return 0;

        int num = solution(n - 1, k);
        return (num + k) % n;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();
        System.out.println(solution(n, k));
    }
}
