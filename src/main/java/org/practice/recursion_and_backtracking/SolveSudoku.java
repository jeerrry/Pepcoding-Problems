package org.practice.recursion_and_backtracking;

import java.util.*;

public class SolveSudoku {
    public static void display(int[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void solveSudoku(int[][] board, int i, int j) {
        // write your code here
        if (j == board.length) {
            solveSudoku(board, i + 1, 0);
            return;
        }

        if (i == board.length) {
            // Print Result.
            display(board);
            return;
        }

        if (board[i][j] > 0) {
            solveSudoku(board, i, j + 1);
            return;
        }

        for (int k = 1; k <= 9; k++) {
            if (!isSafe(board, i, j, k)) continue;

            board[i][j] = k;
            solveSudoku(board, i, j + 1);
            board[i][j] = 0;
        }
    }

    private static boolean isSafe(int[][] board, int i, int j, int val) {
        // Is Row Safe
        for (int k = 0; k < board.length; k++) {
            if (board[i][k] == val) return false;
        }

        // Is Column Safe
        for (int k = 0; k < board.length; k++) {
            if (board[k][j] == val) return false;
        }

        // Is 3x3 Grid Safe
        int startRow = (i / 3) * 3;
        int startCol = (j / 3) * 3;
        for (int k = startRow; k < startRow + 3; k++) {
            for (int z = startCol; z < startCol + 3; z++) {
                if (board[k][z] == val) return false;
            }
        }

        return true;
    }

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int[][] arr = new int[9][9];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                arr[i][j] = scn.nextInt();
            }
        }

        solveSudoku(arr, 0, 0);
    }
}
