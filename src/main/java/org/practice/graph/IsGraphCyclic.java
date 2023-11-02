package org.practice.graph;

import java.io.*;
import java.util.*;

// https://www.pepcoding.com/resources/online-java-foundation/graphs/is-cyclic-official/ojquestion
public class IsGraphCyclic {
    static class Edge {
        int src;
        int nbr;
        int wt;

        Edge(int src, int nbr, int wt) {
            this.src = src;
            this.nbr = nbr;
            this.wt = wt;
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
            int wt = Integer.parseInt(parts[2]);
            graph[v1].add(new Edge(v1, v2, wt));
            graph[v2].add(new Edge(v2, v1, wt));
        }

        // write your code here
        boolean[] visited = new boolean[vtces];
        for (int i = 0; i < vtces; i++) {
            if (visited[i]) continue;

            if (isCyclic(graph, visited, i)) {
                System.out.println("True");
                return;
            }
        }

        System.out.println("False");
    }

    public static boolean isCyclic(ArrayList<Edge>[] graph, boolean[] visited, int src) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(src);

        while (queue.size() > 0) {
            int vtx = queue.remove();

            if (visited[vtx]) return true;
            visited[vtx] = true;

            for (var edge : graph[vtx]) {
                if (visited[edge.nbr]) continue;

                queue.add(edge.nbr);
            }
        }

        return false;
    }
}
