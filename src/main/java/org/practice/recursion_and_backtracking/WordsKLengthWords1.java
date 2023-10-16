package org.practice.recursion_and_backtracking;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;

public class WordsKLengthWords1 {
    public static void generateWords(int cc, String ustr, int ssf, int ts, Character[] spots) {
        if (cc == ustr.length()) {
            if (ssf == ts) {
                for(char c : spots) System.out.print(c);
                System.out.println();
            }
            return;
        }

        char ch = ustr.charAt(cc);
        for (int i = 0; i < spots.length; i++) {
            if (spots[i] != null) continue;

            spots[i] = ch;
            generateWords(cc + 1, ustr, ssf + 1, ts, spots);
            spots[i] = null;
        }

        generateWords(cc + 1, ustr, ssf, ts, spots);
    }

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

        Character[] spots = new Character[k];
        generateWords(0, ustr, 0, k, spots);
    }
}
