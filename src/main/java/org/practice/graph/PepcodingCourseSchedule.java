package org.practice.graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class PepcodingCourseSchedule {
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
            int v = Integer.parseInt(input[0]);
            int u = Integer.parseInt(input[1]);

            graph[u].add(new int[]{u, v});
        }

        int[] result = findOrder(graph);
        for(int val : result) {
            System.out.print(val);
        }
        System.out.println();
    }

    private static int[] findOrder(ArrayList<int[]>[] graph) {
        int[] indegree = new int[graph.length];
        int[] order = new int[graph.length];

        for (int i = 0; i < graph.length; i++) {
            for (int[] nbr : graph[i]) {
                indegree[nbr[1]]++;
            }
        }

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < indegree.length; i++) {
            if (indegree[i] > 0) continue;

            queue.add(i);
        }

        int idx = 0;
        while (queue.size() > 0) {
            int val = queue.remove();
            order[idx++] = val;

            for (int[] nbr : graph[val]) {
                indegree[nbr[1]]--;
                if (indegree[nbr[1]] == 0) {
                    queue.add(nbr[1]);
                }
            }
        }

        if (idx == graph.length) {
            return order;
        }

        return new int[]{-1};
    }
}
