package org.practice.recursion_and_backtracking;

import java.util.HashSet;
import java.util.Scanner;

public class WordsKSelection2 {
    public static void main(String[] args) {
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

        selection(0, ustr, 0, k, "");
    }

    public static void selection(int index, String str, int ssf, int k, String asf) {
        if(ssf == k) {
            System.out.println(asf);
            return;
        }

        for(int i=index; i<str.length(); i++) {
            selection(i + 1, str, ssf + 1, k, asf + str.charAt(i));
        }
    }
}
