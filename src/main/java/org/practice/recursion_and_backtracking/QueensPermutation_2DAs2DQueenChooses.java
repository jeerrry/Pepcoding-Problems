package org.practice.recursion_and_backtracking;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class QueensPermutation_2DAs2DQueenChooses {
    public static void queensPermutations(int qpsf, int tq, int[][] chess) {
        // write your code here
        if (qpsf == tq) {
            StringBuilder result = new StringBuilder();
            for (int i = 0; i < chess.length; i++) {
                for (int j = 0; j < chess[i].length; j++) {
                    if(chess[i][j] > 0) {
                        result.append("q").append(chess[i][j]).append(" ");
                    }else {
                        result.append("- ");
                    }
                }

                result.append("\n");
            }

            System.out.println(result);
        }

        for (int i = 0; i < chess.length; i++) {
            for (int j = 0; j < chess[i].length; j++) {
                if (chess[i][j] > 0) continue;

                chess[i][j] = qpsf + 1;
                queensPermutations(qpsf + 1, tq, chess);
                chess[i][j] = 0;
            }
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] chess = new int[n][n];

        queensPermutations(0, n, chess);
    }
}
