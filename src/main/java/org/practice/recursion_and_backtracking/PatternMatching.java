package org.practice.recursion_and_backtracking;

import java.util.*;

public class PatternMatching {
    public static void solution(String str, String pattern, HashMap<Character, String> map, String op) {
        if (op.length() == 0) {
            if(str.length() == 0) {
                if (map.size() > 0) {
                    for (char key : map.keySet()) {
                        System.out.print(key + "->" + map.get(key) + ",");
                    }
                    System.out.println(".");
                }
            }
            return;
        }

        char c = op.charAt(0);
        String word = "";
        String currentWord = map.getOrDefault(c, "");
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            word += currentChar;
            if (!currentWord.equals("")) {
                if (!word.equals(currentWord)) {
                    continue;
                }
                solution(str.substring(word.length()), pattern, map, op.substring(1));
                return;
            }

            map.put(c, word);
            solution(str.substring(word.length()), pattern, map, op.substring(1));
            map.remove(c, word);
        }

    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        String pattern = scn.next();
        HashMap<Character, String> map = new HashMap<>();
        solution(str, pattern, map, pattern);
    }
}
