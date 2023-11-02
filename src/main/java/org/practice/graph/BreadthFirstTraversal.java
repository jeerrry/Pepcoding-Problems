package org.practice.graph;

import java.io.*;
import java.util.*;

// https://www.pepcoding.com/resources/online-java-foundation/graphs/bfs-graph-official/ojquestion
public class BreadthFirstTraversal {
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

        boolean[] visited = new boolean[vtces];
        Queue<Pair> queue = new LinkedList<>();
        queue.add(new Pair(src, ""));
        visited[src] = true;

        while (queue.size() > 0) {
            Pair current = queue.remove();
            System.out.println(current);

            for (var edge : graph[current.vertex]) {
                if (visited[edge.nbr]) continue;

                visited[edge.nbr] = true;
                var p = new Pair(edge.nbr, current.psf + current.vertex);
                queue.add(p);
            }
        }
    }

    static class Pair {
        int vertex;
        String psf;

        public Pair(int vertex, String pair) {
            this.vertex = vertex;
            this.psf = pair;
        }

        @Override
        public String toString() {
            return vertex + "@" + psf + vertex;
        }
    }
}
