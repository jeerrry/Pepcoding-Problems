package org.practice.recursion_and_backtracking;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class QueensPermutations2d_As_2dBoxChooses {
    public static void queensPermutations(int qpsf, int tq, int row, int col, String asf, boolean[] queens) {
        // write your code here
        if (row == tq) {
            if (qpsf == tq) {
                System.out.println(asf);
                System.out.println();
            }
            return;
        }

        int ncol = col == tq - 1 ? 0 : col + 1;
        int nrow = col == tq - 1 ? row + 1 : row;
        for (int i = 0; i < tq; i++) {
            if (queens[i]) continue;

            queens[i] = true;
            queensPermutations(
                    qpsf + 1,
                    tq,
                    nrow,
                    ncol,
                    asf + "q" + (i + 1) + " " + (col == tq - 1 ? "\n" : ""),
                    queens);
            queens[i] = false;
        }

        queensPermutations(qpsf, tq, nrow, ncol, asf + "- " + (col == tq - 1 ? "\n" : ""), queens);
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        boolean[] queens = new boolean[n];

        queensPermutations(0, n, 0, 0, "", queens);
    }
}
