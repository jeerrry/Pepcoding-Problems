package org.practice.recursion_and_backtracking;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

public class PermutationsWords1 {
    public static void generateWords(int cs, int ts, HashMap<Character, Integer> fmap, String asf) {
        // write your code here
        if (cs > ts) {
            System.out.println(asf);
            System.out.println();
            return;
        }

        for (char key : fmap.keySet()) {
            int frequency = fmap.get(key);

            if(frequency == 0) continue;
            fmap.put(key, frequency - 1);
            generateWords(cs + 1, ts, fmap, asf + key);
            fmap.put(key, frequency);
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        HashMap<Character, Integer> fmap = new HashMap<>();
        for (char ch : str.toCharArray()) {
            if (fmap.containsKey(ch)) {
                fmap.put(ch, fmap.get(ch) + 1);
            } else {
                fmap.put(ch, 1);
            }
        }

        generateWords(1, str.length(), fmap, "");
    }
}
