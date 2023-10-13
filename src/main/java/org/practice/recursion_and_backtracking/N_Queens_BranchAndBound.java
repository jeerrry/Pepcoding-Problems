package org.practice.recursion_and_backtracking;

import java.util.Scanner;

public class N_Queens_BranchAndBound {
    public static void nqueens(boolean[][] board, int qpsf, boolean[] cols, boolean[] ldiag, boolean[] rdiag, String psf) {
        if (qpsf == board.length) {
            System.out.println(psf);
            System.out.println();
            return;
        }

        for(int i=0; i<board.length; i++) {
            if(cols[i] || ldiag[qpsf + i] || rdiag[qpsf - i + board.length - 1]) continue;

            cols[i] = true;
            ldiag[qpsf + i] = true;
            rdiag[qpsf - i + board.length - 1] = true;
            board[qpsf][i] = true;

            nqueens(board, qpsf + 1, cols, ldiag, rdiag, psf + qpsf+"-"+i+", ");

            cols[i] = false;
            ldiag[qpsf + i] = false;
            rdiag[qpsf - i + board.length - 1] = false;
            board[qpsf][i] = false;
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        boolean[][] board = new boolean[n][n];
        boolean[] cols = new boolean[n];
        boolean[] ldiag = new boolean[2 * n - 1];
        boolean[] rdiag = new boolean[2 * n - 1];

        nqueens(board, 0, cols, ldiag, rdiag, "");
    }
}
