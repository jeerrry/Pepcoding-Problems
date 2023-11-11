package org.practice.graph;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.util.*;
import java.io.*;

public class PepcoderAndReversing {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] input = reader.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);

        ArrayList<int[]>[] graph = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < m; i++) {
            input = reader.readLine().split(" ");
            int u = Integer.parseInt(input[0]) - 1;
            int v = Integer.parseInt(input[1]) - 1;

            graph[u].add(new int[]{v, 0});
            graph[v].add(new int[]{u, 1});
        }

        LinkedList<int[]> queue = new LinkedList<>();
        boolean[] visited = new boolean[n];

        queue.addFirst(new int[]{0, 0});

        while (queue.size() > 0) {
            int[] pair = queue.removeFirst();
            if (visited[pair[0]]) continue;
            if (pair[0] == n - 1) {
                System.out.println(pair[1]);
                return;
            }

            visited[pair[0]] = true;
            for (int[] path : graph[pair[0]]) {
                if (visited[path[0]]) continue;
                if (path[1] + pair[1] <= pair[1]) {
                    queue.addFirst(new int[]{path[0], path[1] + pair[1]});
                    continue;
                }
                queue.addLast(new int[]{path[0], path[1] + pair[1]});
            }
        }

        System.out.println("-1");
    }
}
