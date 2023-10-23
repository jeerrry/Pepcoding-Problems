package org.practice.recursion_and_backtracking;

import java.util.*;

public class AllPalindromicPermutations {
    public static void generatepw(int cs, int ts, HashMap<Character, Integer> fmap, Character oddc, String asf) {
        if (cs > ts) {
            String result = asf + (oddc != null ? oddc : "") + new StringBuilder(asf).reverse();
            System.out.println(result);
            return;
        }

        for (char c : fmap.keySet()) {
            int freq = fmap.get(c);
            if (freq == 0) continue;

            fmap.put(c, freq - 1);
            generatepw(cs + 1, ts, fmap, oddc, asf + c);
            fmap.put(c, freq);
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        HashMap<Character, Integer> fmap = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            fmap.put(ch, fmap.getOrDefault(ch, 0) + 1);
        }

        //write your code here
        int length = 0;
        int osf = 0;
        Character odd = null;
        for (char c : fmap.keySet()) {
            int frequency = fmap.get(c);
            if (frequency % 2 == 1) {
                odd = c;
                osf++;
            }

            fmap.put(c, frequency / 2);
            length += (frequency / 2);
            if (osf > 1) {
                System.out.println("-1");
                return;
            }
        }

        generatepw(1, length, fmap, odd, "");
    }
}
