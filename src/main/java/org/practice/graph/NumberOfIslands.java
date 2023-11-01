package org.practice.graph;

import java.io.*;

public class NumberOfIslands {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int m = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[m][n];

        for (int i = 0; i < arr.length; i++) {
            String parts = br.readLine();
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = Integer.parseInt(parts.split(" ")[j]);
            }
        }

        int islandCount = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] == 1) continue;
                exploreIsland(arr, i, j);
                islandCount++;
            }
        }

        System.out.println(islandCount);
    }

    public static void exploreIsland(int[][] island, int row, int col) {
        if(row < 0 || col < 0 || row >= island.length || col >= island[0].length) return;
        if(island[row][col] == 1) return;

        island[row][col] = 1;
        exploreIsland(island, row - 1, col);
        exploreIsland(island, row + 1, col);
        exploreIsland(island, row, col - 1);
        exploreIsland(island, row , col + 1);
    }
}
