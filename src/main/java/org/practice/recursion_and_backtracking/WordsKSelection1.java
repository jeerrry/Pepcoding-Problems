package org.practice.recursion_and_backtracking;

import java.util.HashSet;
import java.util.Scanner;

public class WordsKSelection1 {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        int k = scn.nextInt();

        HashSet<Character> unique = new HashSet<>();
        String ustr = "";
        for (char ch : str.toCharArray()) {
            if (!unique.contains(ch)) {
                unique.add(ch);
                ustr += ch;
            }
        }

        combination(0, ustr, 0, k, "");
    }


    public static void combination(int i, String ustr, int ssf, int ts, String asf) {
        if(ssf == ts) {
            System.out.println(asf);
            return;
        }

        if(i == ustr.length()) {
            return;
        }

        char c = ustr.charAt(i);
        combination(i + 1, ustr, ssf + 1, ts, asf + c);
        combination(i + 1, ustr, ssf, ts, asf);
    }

}
