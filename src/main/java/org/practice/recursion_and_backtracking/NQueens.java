package org.practice.recursion_and_backtracking;

import java.util.Scanner;

public class NQueens {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        printNQueens(new int[n][n], "", 0);
    }

    public static void printNQueens(int[][] chess, String qsf, int row) {
        if (row == chess.length) {
            System.out.println(qsf + " .");
            return;
        }

        for (int i = 0; i < chess.length; i++) {
            if (canPlace(chess, row, i)) {
                chess[row][i] = 1;
                printNQueens(chess, qsf+ row + "-" + i + ", ", row + 1);
                chess[row][i] = 0;
            }
        }
    }

    private static boolean canPlace(int[][] chess, int row, int col) {
        // Vertical Check
        for (int i = row - 1; i >= 0; i--) {
            if (chess[i][col] > 0) return false;
        }

        // Left Diagonal
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (chess[i][j] > 0) return false;
        }

        // Right Diagonal
        for (int i = row - 1, j = col + 1; i >= 0 && j < chess.length; i--, j++) {
            if (chess[i][j] > 0) return false;
        }

        return true;
    }
}
