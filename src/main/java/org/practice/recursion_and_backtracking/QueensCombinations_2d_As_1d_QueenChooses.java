package org.practice.recursion_and_backtracking;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class QueensCombinations_2d_As_1d_QueenChooses {
    public static void queensCombinations(int qpsf, int tq, boolean[][] chess, int lcno) {
        // write your code here
        if (qpsf == tq) {
            // Print Queens
            StringBuilder builder = new StringBuilder();
            for (int i = 0; i < tq; i++) {
                for (int j = 0; j < tq; j++) {
                    if (chess[i][j]) {
                        builder.append("q ");
                    } else {
                        builder.append("- ");
                    }
                }
                builder.append("\n");
            }

            System.out.println(builder);
            System.out.println();
            return;
        }

        int nrow = (lcno + 1) / tq;
        int ncol = (lcno + 1) % tq;

        if(nrow == tq) return;

        chess[nrow][ncol] = true;
        queensCombinations(qpsf + 1, tq, chess, lcno + 1);
        chess[nrow][ncol] = false;

        queensCombinations(qpsf, tq, chess, lcno + 1);
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        boolean[][] chess = new boolean[n][n];

        queensCombinations(0, n, chess, -1);
    }
}
