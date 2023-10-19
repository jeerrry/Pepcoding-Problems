package org.practice.recursion_and_backtracking;

import java.util.*;

public class GoldMine2 {
    static int max = 0;

    public static void getMaxGold(int[][] arr) {
        //write your code here
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                max = Math.max(max, getMaxGoldHelper(arr, i, j));
            }
        }

    }

    private static int getMaxGoldHelper(int[][] arr, int row, int col) {
        if (row < 0 || col < 0 || row == arr.length || col == arr.length) return 0;
        if (arr[row][col] <= 0) return 0;

        int currentVal = arr[row][col];
        arr[row][col] *= -1;
        int localMax = Math.max(getMaxGoldHelper(arr, row + 1, col), Math.max(getMaxGoldHelper(arr, row - 1, col), Math.max(getMaxGoldHelper(arr, row, col + 1), getMaxGoldHelper(arr, row, col - 1))));
        arr[row][col] *= -1;

        return currentVal + localMax;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] arr = new int[m][n];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
        getMaxGold(arr);
        System.out.println(max);
    }
}
