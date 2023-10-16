package org.practice.recursion_and_backtracking;

import java.io.*;
import java.util.HashMap;

public class WordsKLengthWords4 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int k = Integer.parseInt(br.readLine());
        String ustr = "";
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (char c : str.toCharArray()) {
            if (hashMap.containsKey(c)) {
                hashMap.put(c, hashMap.get(c) + 1);
            } else {
                ustr += c;
                hashMap.put(c, 1);
            }
        }

        generateWords(0, ustr, "", k, hashMap);
    }

    public static void generateWords(int currentSpot, String str, String asf, int target, HashMap<Character, Integer> map) {
        if (currentSpot == target) {
            System.out.println(asf);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (map.get(c) == 0) continue;

            map.put(c, map.get(c) - 1);
            generateWords(currentSpot + 1, str, asf + str.charAt(i), target, map);
            map.put(c, map.get(c) + 1);
        }
    }
}
