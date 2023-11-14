package org.practice.graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BellmanFord {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] config = reader.readLine().split(" ");

        int vtx = Integer.parseInt(config[0]);
        int edgs = Integer.parseInt(config[1]);

        int[][] graph = new int[edgs][3];
        for (int i = 0; i < edgs; i++) {
            String[] input = reader.readLine().split(" ");
            int src = Integer.parseInt(input[0]) - 1;
            int tar = Integer.parseInt(input[1]) - 1;
            int wt = Integer.parseInt(input[2]);

            graph[i] = new int[]{src, tar, wt};
        }

        int[] result = new int[vtx];
        Arrays.fill(result, Integer.MAX_VALUE);
        result[0] = 0;

        applyBellmanFord(graph, result, vtx - 1);

        for (int i = 1; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
        System.out.println();
    }

    private static void applyBellmanFord(int[][] edges, int[] result, int iterations) {
        for (int i = 0; i < iterations; i++) {
            for (int[] edge : edges) {
                int src = edge[0];
                int tar = edge[1];
                int wt = edge[2];

                if (result[src] == Integer.MAX_VALUE) continue;

                int update = Math.min((result[src] + wt), result[tar]);
                result[tar] = update;
            }
        }
    }
}
