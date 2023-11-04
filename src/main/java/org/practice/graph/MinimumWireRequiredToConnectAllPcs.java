package org.practice.graph;

import java.util.*;
import java.io.*;

public class MinimumWireRequiredToConnectAllPcs {
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

    static class Pair implements Comparable<Pair> {
        int vtx;
        int src;
        int wt;

        public Pair(int vtx, int src, int wt) {
            this.vtx = vtx;
            this.src = src;
            this.wt = wt;
        }

        public int compareTo(Pair o) {
            return this.wt - o.wt;
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
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        pq.add(new Pair(0, -1, 0));

        while (pq.size() > 0) {
            Pair p = pq.remove();
            if (visited[p.vtx]) continue;
            if (p.src > -1) System.out.println("["+p.vtx + "-" + p.src + "@" + p.wt+"]");

            visited[p.vtx] = true;

            for (var edge : graph[p.vtx]) {
                if (visited[edge.nbr]) continue;
                pq.add(new Pair(edge.nbr, p.vtx, edge.wt));
            }
        }
    }
}
