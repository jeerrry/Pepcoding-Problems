package org.practice.recursion_and_backtracking;

import java.io.*;
import java.util.HashMap;

public class WordsKLengthWords3 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int k = Integer.parseInt(br.readLine());

        HashMap<Character, Integer> loc = new HashMap<>();
        for (char c : str.toCharArray()) loc.put(c, -1);

        generateWords(0, str, 0, new Character[k], loc);
    }

    public static void generateWords(int cc, String str, int ssf, Character[] spots, HashMap<Character, Integer> loc) {
        if (cc == str.length()) {
            if (ssf == spots.length) {
                for (char c : spots) {
                    System.out.print(c);
                }
                System.out.println();
            }
            return;
        }

        char item = str.charAt(cc);
        int lo = loc.get(item);
        for (int i = lo + 1; i < spots.length; i++) {
            if (spots[i] != null) continue;

            loc.put(item, i);
            spots[i] = item;
            generateWords(cc + 1, str, ssf + 1, spots, loc);
            loc.put(item, lo);
            spots[i] = null;
        }

        if (lo == -1) {
            generateWords(cc + 1, str, ssf, spots, loc);
        }
    }
}
