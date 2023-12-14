package org.practice.dynamicprogramming;

import java.io.IOException;
import java.util.Scanner;

public class MinCostInMazeTraversal {
    public static void main(String[] args) throws IOException {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();

        int[][] maze = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                maze[i][j] = scn.nextInt();
            }
        }

        Integer[][] result = new Integer[n][m];

        for (int i = n - 1; i >= 0; i--) {
            for (int j = m - 1; j >= 0; j--) {
                int[][] dirs = {{1, 0}, {0, 1}};
                for (int[] dir : dirs) {
                    int nrow = i + dir[0];
                    int ncol = j + dir[1];

                    if (nrow == n || ncol == m) continue;
                    if (result[i][j] == null) result[i][j] = result[nrow][ncol] + maze[i][j];
                    else result[i][j] = Math.min(result[nrow][ncol] + maze[i][j], result[i][j]);
                }

                if (result[i][j] == null) result[i][j] = maze[i][j];
            }
        }

        System.out.println(result[0][0]);
    }
}
