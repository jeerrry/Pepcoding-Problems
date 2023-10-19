package org.practice.recursion_and_backtracking;

import java.util.*;

public class Cryptarithmetic {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s1 = scn.nextLine();
        String s2 = scn.nextLine();
        String s3 = scn.nextLine();

        HashMap<Character, Integer> charIntMap = new HashMap<>();
        String unique = "";
        for (int i = 0; i < s1.length(); i++) {
            if (!charIntMap.containsKey(s1.charAt(i))) {
                charIntMap.put(s1.charAt(i), -1);
                unique += s1.charAt(i);
            }
        }

        for (int i = 0; i < s2.length(); i++) {
            if (!charIntMap.containsKey(s2.charAt(i))) {
                charIntMap.put(s2.charAt(i), -1);
                unique += s2.charAt(i);
            }
        }

        for (int i = 0; i < s3.length(); i++) {
            if (!charIntMap.containsKey(s3.charAt(i))) {
                charIntMap.put(s3.charAt(i), -1);
                unique += s3.charAt(i);
            }
        }

        boolean[] usedNumbers = new boolean[10];
        solution(unique, 0, charIntMap, usedNumbers, s1, s2, s3);
    }


    public static void solution(String unique, int idx, HashMap<Character, Integer> charIntMap, boolean[] usedNumbers, String s1, String s2, String s3) {
        if (idx == unique.length()) {
            // End Case
            if (isSumEqual(charIntMap, s1, s2, s3)) {
                StringBuilder result = new StringBuilder();
                for (int i = 0; i < 26; i++) {
                    char c = (char) ('a' + i);
                    if (charIntMap.containsKey(c)) {
                        result.append(c).append("-").append(charIntMap.get(c)).append(" ");
                    }
                }
                System.out.println(result);
            }
            return;
        }

        char character = unique.charAt(idx);
        for (int i = 0; i <= 9; i++) {
            if (usedNumbers[i]) continue;

            usedNumbers[i] = true;
            charIntMap.put(character, i);
            solution(unique, idx + 1, charIntMap, usedNumbers, s1, s2, s3);
            usedNumbers[i] = false;
            charIntMap.put(character, -1);
        }
    }

    private static boolean isSumEqual(HashMap<Character, Integer> map, String s1, String s2, String s3) {
        int num1 = convertStringToNumber(s1, map);
        int num2 = convertStringToNumber(s2, map);
        int result = convertStringToNumber(s3, map);

        return (num1 + num2) == result;
    }

    private static int convertStringToNumber(String s, HashMap<Character, Integer> map) {
        StringBuilder nums = new StringBuilder();
        for (char c : s.toCharArray()) {
            int val = map.get(c);
            nums.append(val);
        }

        return nums.length() > 0 ? Integer.parseInt(nums.toString()) : 0;
    }
}
