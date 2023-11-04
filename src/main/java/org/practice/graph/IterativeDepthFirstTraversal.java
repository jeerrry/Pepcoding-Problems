package org.practice.graph;

import java.util.*;
import java.io.*;

public class IterativeDepthFirstTraversal {
    static class Edge {
        int src;
        int nbr;

        Edge(int src, int nbr) {
            this.src = src;
            this.nbr = nbr;
        }
    }

    static class Pair {
        int src;
        String path;

        public Pair(int src, String path) {
            this.src = src;
            this.path = path + src;
        }

        @Override
        public String toString() {
            return this.src + "@" + this.path;
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

        // write your code here
        Stack<Pair> stack = new Stack<>();
        boolean[] visited = new boolean[vtces];
        stack.push(new Pair(src, ""));

        while (stack.size() > 0) {
            Pair p = stack.pop();
            if(visited[p.src]) continue;

            System.out.println(p);
            visited[p.src] = true;

            for (var edge : graph[p.src]) {
                if (visited[edge.nbr]) continue;

                stack.push(new Pair(edge.nbr, p.path));
            }
        }
    }
}
