package org.practice.recursion_and_backtracking;

import java.io.*;
import java.util.*;

public class PermutationsWords2 {
    public static void generateWords(int cc, String str, Character[] spots, HashMap<Character, Integer> lastOccurence) {
        // write your code here
        if (cc == str.length()) {
            StringBuilder builder = new StringBuilder();
            for (char c : spots) {
                builder.append(c);
            }

            System.out.println(builder);
            return;
        }

        char c = str.charAt(cc);
        int li = lastOccurence.get(c);

        for (int i = li + 1; i < str.length(); i++) {
            if (spots[i] != null) continue;
            spots[i] = c;
            lastOccurence.put(c, i);
            generateWords(cc + 1, str, spots, lastOccurence);
            spots[i] = null;
            lastOccurence.put(c, li);
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        Character[] spots = new Character[str.length()];
        HashMap<Character, Integer> lastOccurence = new HashMap<>();
        for (char ch : str.toCharArray()) {
            lastOccurence.put(ch, -1);
        }

        generateWords(0, str, spots, lastOccurence);
    }
}
