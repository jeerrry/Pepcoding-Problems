package org.practice.recursion_and_backtracking;

import java.util.*;

public class CrosswordPuzzle {
    public static void solution(char[][] arr, String[] words, int vidx) {
        if (vidx == words.length) {
            print(arr);
            return;
        }

        String word = words[vidx];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (canPlaceHorizontal(arr, word, i, j)) {
                    placeHorizontal(arr, word, i, j);
                    solution(arr, words, vidx + 1);
                    removeHorizontal(arr, word, i, j);
                }

                if (canPlaceVertical(arr, word, i, j)) {
                    placeVertical(arr, word, i, j);
                    solution(arr, words, vidx + 1);
                    removeVertical(arr, word, i, j);
                }
            }
        }
    }

    private static boolean canPlaceHorizontal(char[][] arr, String word, int row, int col) {
        int i = 0;
        for (; i < word.length(); i++) {
            if (col + i == arr.length) return false;
            if (arr[row][col + i] != '-' && arr[row][col + i] != word.charAt(i)) return false;
        }

        return col + i == arr.length || arr[row][col + i] == '+';
    }

    private static boolean canPlaceVertical(char[][] arr, String word, int row, int col) {
        int i = 0;
        for (; i < word.length(); i++) {
            if (row + i == arr.length) return false;
            else if (arr[row + i][col] != '-' && arr[row + i][col] != word.charAt(i)) return false;
        }

        return row + i == arr.length || arr[row + i][col] == '+';
    }

    private static void placeHorizontal(char[][] arr, String word, int row, int col) {
        for (int i = 0; i < word.length(); i++) {
            arr[row][col + i] = word.charAt(i);
        }
    }

    private static void removeHorizontal(char[][] arr, String word, int row, int col) {
        for (int i = 0; i < word.length(); i++) {
            arr[row][col + i] = '-';
        }
    }

    private static void placeVertical(char[][] arr, String word, int row, int col) {
        for (int i = 0; i < word.length(); i++) {
            arr[row + i][col] = word.charAt(i);
        }
    }

    private static void removeVertical(char[][] arr, String word, int row, int col) {
        for (int i = 0; i < word.length(); i++) {
            arr[row + i][col] = '-';
        }
    }

    public static void print(char[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        char[][] arr = new char[10][10];
        for (int i = 0; i < arr.length; i++) {
            String str = scn.next();
            arr[i] = str.toCharArray();
        }
        int n = scn.nextInt();
        String[] words = new String[n];
        for (int i = 0; i < words.length; i++) {
            words[i] = scn.next();
        }
        solution(arr, words, 0);
    }
}
