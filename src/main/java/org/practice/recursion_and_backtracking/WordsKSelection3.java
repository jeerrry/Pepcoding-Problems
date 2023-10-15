package org.practice.recursion_and_backtracking;

import java.util.*;
import java.io.*;

public class WordsKSelection3 {
    public static void generateSelection(int cc, String ustr, int ssf, int ts, HashMap<Character, Integer> unique, String asf) {
        if (cc == ustr.length()) {
            if (ssf == ts) {
                System.out.println(asf);
            }
            return;
        }

        char c = ustr.charAt(cc);
        for (int i = unique.get(c); i > 0; i--) {
            char[] arr = new char[i];
            Arrays.fill(arr, c);
            generateSelection(cc + 1, ustr, ssf + i, ts, unique, asf + new String(arr));
        }

        generateSelection(cc + 1, ustr, ssf, ts, unique, asf);
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int k = Integer.parseInt(br.readLine());

        HashMap<Character, Integer> unique = new HashMap<>();
        String ustr = "";
        for (char ch : str.toCharArray()) {
            if (unique.containsKey(ch) == false) {
                unique.put(ch, 1);
                ustr += ch;
            } else {
                unique.put(ch, unique.get(ch) + 1);
            }
        }

        generateSelection(0, ustr, 0, k, unique, "");
    }
}
