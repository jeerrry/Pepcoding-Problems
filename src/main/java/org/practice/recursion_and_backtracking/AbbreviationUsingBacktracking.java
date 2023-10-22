package org.practice.recursion_and_backtracking;

import java.util.*;

public class AbbreviationUsingBacktracking {
    public static void solution(String str, String asf, int count, int pos) {
        if (pos == str.length()) {
            if (count > 0) {
                System.out.println(asf + count);
            } else {
                System.out.println(asf);
            }
            return;
        }

        char c = str.charAt(pos);
        solution(str, asf + (count > 0 ? count : "") + c, 0, pos + 1);
        solution(str, asf, count + 1, pos + 1);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        solution(str, "", 0, 0);
    }
}
