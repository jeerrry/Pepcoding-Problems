package org.practice.recursion_and_backtracking;

import java.util.*;

public class AllPalindromicPartitions {
    public static void solution(String str, String asf) {
        //write you code here
        if (str.length() == 0) {
            if (asf.length() == 0) return;

            System.out.println(asf);
        }

        StringBuilder res = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            res.append(c);
            if (!isPalindrome(res.toString())) continue;
            solution(str.substring(i + 1), asf + "(" + res + ")");
        }
    }

    private static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            int lc = str.charAt(left);
            int rc = str.charAt(right);
            if (lc != rc) return false;
            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        solution(str, "");
    }
}
