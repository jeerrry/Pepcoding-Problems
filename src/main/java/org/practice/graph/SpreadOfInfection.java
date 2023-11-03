package org.practice.graph;

import java.util.*;
import java.io.*;

public class SpreadOfInfection {
    static class Edge {
        int src;
        int nbr;

        Edge(int src, int nbr) {
            this.src = src;
            this.nbr = nbr;
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int vtces = Integer.parseInt(br.readLine());
        ArrayList<Edge>[] graph = new ArrayList[vtces];
        for (int i = 0; i < vtces; i++) {
            graph[i] = new ArrayList<>();
        }

        int edges = Integer.parseInt(br.readLine());
        for (int i = 0; i < edges; i++) {
            String[] parts = br.readLine().split(" ");
            int v1 = Integer.parseInt(parts[0]);
            int v2 = Integer.parseInt(parts[1]);
            graph[v1].add(new Edge(v1, v2));
            graph[v2].add(new Edge(v2, v1));
        }

        int src = Integer.parseInt(br.readLine());
        int t = Integer.parseInt(br.readLine());

        boolean[] visited = new boolean[vtces];
        int count = 0;
        Queue<int[][]> queue = new LinkedList<>();
        queue.add(new int[][]{{src, 1}});

        while (queue.size() > 0) {
            int[][] node = queue.remove();
            int vtx = node[0][0];
            int lvl = node[0][1];

            if (visited[vtx]) continue;
            if (lvl > t) break;

            visited[vtx] = true;
            count += 1;
            for (var edge : graph[vtx]) {
                if (visited[edge.nbr]) continue;
                queue.add(new int[][]{{edge.nbr, lvl + 1}});
            }
        }

        System.out.println(count);
    }
}
