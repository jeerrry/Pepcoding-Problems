package org.practice.graph;

import java.io.*;
import java.util.ArrayList;

public class PerfectFriends {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int k = Integer.parseInt(br.readLine());

        ArrayList<int[]>[] graph = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < k; i++) {
            String[] input = br.readLine().split(" ");

            int nodeA = Integer.parseInt(input[0]);
            int nodeB = Integer.parseInt(input[1]);

            graph[nodeA].add(new int[]{nodeA, nodeB});
            graph[nodeB].add(new int[]{nodeB, nodeA});
        }

        // Getting Connected Components
        ArrayList<Integer> members = new ArrayList<>();
        boolean[] visited = new boolean[n];
        for (int i = 0; i < n; i++) {
            int count = getMembersInGroup(graph, i, visited);
            if (count > 0) members.add(count);
        }

        // Possible Friends
        int result = 0;
        for (int i = 0; i < members.size(); i++) {
            for (int j = i + 1; j < members.size(); j++) {
                result += members.get(i) * members.get(j);
            }
        }

        System.out.println(result);

    }

    public static int getMembersInGroup(ArrayList<int[]>[] graph, int src, boolean[] visited) {
        if (visited[src]) return 0;

        int count = 1;
        visited[src] = true;
        for (var edge : graph[src]) {
            count += getMembersInGroup(graph, edge[1], visited);
        }

        return count;
    }
}
