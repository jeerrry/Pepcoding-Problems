package org.practice.recursion_and_backtracking;

import java.util.*;

public class MaxScore {
    public static int solution(String[] words, int[] farr, int[] score, int idx) {
        if (idx == words.length) return 0;

        int notIncluded = solution(words, farr, score, idx + 1);

        // Consume Word
        String word = words[idx];
        StringBuilder usf = new StringBuilder();
        int currentScore = 0;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (farr[c - 'a'] == 0) break;
            farr[c - 'a']--;
            currentScore += score[c - 'a'];
            usf.append(c);
        }

        if (usf.length() != word.length()) {
            // Unconsume Word
            for (char c : usf.toString().toCharArray()) {
                farr[c - 'a']++;
            }

            return Math.max(0, notIncluded);
        }

        int included = solution(words, farr, score, idx + 1);

        // Unconsume Word
        for (char c : usf.toString().toCharArray()) {
            farr[c - 'a']++;
        }

        return Math.max(included + currentScore, notIncluded);
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int nofWords = scn.nextInt();
        String[] words = new String[nofWords];
        for (int i = 0; i < words.length; i++) {
            words[i] = scn.next();
        }
        int nofLetters = scn.nextInt();
        char[] letters = new char[nofLetters];
        for (int i = 0; i < letters.length; i++) {
            letters[i] = scn.next().charAt(0);
        }
        int[] score = new int[26];
        for (int i = 0; i < score.length; i++) {
            score[i] = scn.nextInt();
        }
        if (words == null || words.length == 0 || letters == null || letters.length == 0 || score == null
                || score.length == 0) {
            System.out.println(0);
            return;
        }
        int[] farr = new int[score.length];
        for (char ch : letters) {
            farr[ch - 'a']++;
        }
        System.out.println(solution(words, farr, score, 0));
    }
}
