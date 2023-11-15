package org.practice.graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;

public class KosarajuAlgorithm {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] input = reader.readLine().split(" ");
        int vtx = Integer.parseInt(input[0]);
        int edgs = Integer.parseInt(input[1]);

        ArrayList<int[]>[] graph = new ArrayList[vtx];
        for (int i = 0; i < vtx; i++) {
            graph[i] = new ArrayList<>();
        }

        // Create Graph
        for (int i = 0; i < edgs; i++) {
            input = reader.readLine().split(" ");
            int src = Integer.parseInt(input[0]) - 1;
            int tar = Integer.parseInt(input[1]) - 1;

            graph[src].add(new int[]{src, tar});
        }

        Stack<Integer> stack = new Stack<>();
        boolean[] visited = new boolean[vtx];
        for (int i = 0; i < vtx; i++) {
            if (visited[i]) continue;

            dfs(i, graph, visited, stack);
        }

        // Reverse Graph
        ArrayList<int[]>[] ngraph = new ArrayList[vtx];
        for (int i = 0; i < vtx; i++) {
            ngraph[i] = new ArrayList<>();
        }

        for (int i = 0; i < vtx; i++) {
            for (int[] edge : graph[i]) {
                ArrayList<int[]> target = ngraph[edge[1]];
                target.add(new int[]{edge[1], edge[0]});
            }
        }

        // Count Component
        int count = 0;
        visited = new boolean[vtx];
        while (stack.size() > 0) {
            int src = stack.pop();
            if (visited[src]) continue;
            dfs(src, ngraph, visited, new Stack<Integer>());
            count++;
        }

        System.out.println(count);
    }

    private static void dfs(int src, ArrayList<int[]>[] graph, boolean[] visited, Stack<Integer> stack) {
        visited[src] = true;
        for (int[] edge : graph[src]) {
            if (visited[edge[1]]) continue;

            dfs(edge[1], graph, visited, stack);
        }

        stack.push(src);
    }
}
