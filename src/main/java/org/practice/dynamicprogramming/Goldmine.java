package org.practice.dynamicprogramming;

import java.util.Scanner;

public class Goldmine {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();

        int[][] maze = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                maze[i][j] = scn.nextInt();
            }
        }

        int[][] result = new int[n][m];
        int[][] dirs = {{1, 1}, {0, 1}, {-1, 1}};
        for (int i = m - 1; i >= 0; i--) {
            for (int j = 0; j < n; j++) {
                if (i == m - 1) {
                    result[j][i] = maze[j][i];
                    continue;
                }

                for (int[] dir : dirs) {
                    int nrow = j + dir[0];
                    int ncol = i + dir[1];

                    if (nrow < 0 || ncol < 0) continue;
                    if (nrow == n || ncol == m) continue;

                    result[j][i] = Math.max(result[j][i], maze[j][i] + result[nrow][ncol]);
                }
            }
        }

        int ans = -1;
        for (int i = 0; i < n; i++) {
            ans = Math.max(ans, result[i][0]);
        }

        System.out.println(ans);
    }
}
