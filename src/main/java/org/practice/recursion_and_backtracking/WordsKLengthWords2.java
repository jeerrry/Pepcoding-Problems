package org.practice.recursion_and_backtracking;

import java.util.*;
import java.io.*;

public class WordsKLengthWords2 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int k = Integer.parseInt(br.readLine());

        HashSet<Character> unique = new HashSet<>();
        String ustr = "";
        for (char ch : str.toCharArray()) {
            if (unique.contains(ch) == false) {
                unique.add(ch);
                ustr += ch;
            }
        }

        generateWords(0, ustr, k, "", new int[26]);
    }

    public static void generateWords(int spot, String ustr, int ts, String asf, int[] used) {
        if (spot == ts) {
            System.out.println(asf);
            return;
        }

        for (int i = 0; i < ustr.length(); i++) {
            char cc = ustr.charAt(i);

            if (used[cc - 'a'] > 0) continue;

            used[cc - 'a'] = 1;
            generateWords(spot + 1, ustr, ts, asf + cc, used);
            used[cc - 'a'] = 0;
        }
    }
}
