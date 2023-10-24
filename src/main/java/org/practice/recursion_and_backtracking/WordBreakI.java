package org.practice.recursion_and_backtracking;

import java.util.*;

public class WordBreakI {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        HashSet<String> dict = new HashSet<>();
        for (int i = 0; i < n; i++) {
            dict.add(scn.next());
        }
        String sentence = scn.next();
        wordBreak(sentence, "", dict);
    }

    public static void wordBreak(String str, String ans, HashSet<String> dict) {
        if(str.length() == 0) {
            if(ans.length() > 0) {
                System.out.println(ans);
            }
            return;
        }

        String wsf = "";
        for (char c : str.toCharArray()) {
            wsf += c;

            if (!dict.contains(wsf)) continue;
            wordBreak(str.substring(wsf.length()), ans + wsf + " ", dict);
        }
    }
}
