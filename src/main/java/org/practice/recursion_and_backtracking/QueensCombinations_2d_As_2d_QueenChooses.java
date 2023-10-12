package org.practice.recursion_and_backtracking;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class QueensCombinations_2d_As_2d_QueenChooses {
    public static void queensCombinations(int qpsf, int tq, boolean[][] chess, int i, int j) {
        // write your code here
        if (qpsf == tq) {

            StringBuilder result = new StringBuilder();
            for (int l = 0; l < chess.length; l++) {
                for (int m = 0; m < chess.length; m++) {
                    if (chess[l][m]) {
                        result.append("q ");
                    } else {
                        result.append("- ");
                    }
                }
                result.append("\n");
            }

            System.out.println(result);
            return;
        }

        int ncol = j == tq - 1 ? 0 : j + 1;
        int nrow = j == tq - 1 ? i + 1 : i;

        if(nrow == tq) return;

        chess[nrow][ncol] = true;
        queensCombinations(qpsf + 1, tq, chess, nrow, ncol);

        chess[nrow][ncol] = false;
        queensCombinations(qpsf, tq, chess, nrow, ncol);
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        boolean[][] chess = new boolean[n][n];

        queensCombinations(0, n, chess, 0, -1);
    }
}
