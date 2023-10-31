package org.practice.graph;

import java.util.*;
import java.io.*;

public class IsGraphConnected {
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
        isConnected(graph, 0, visited);

        for(boolean status : visited) {
            if(!status) {
                System.out.println("false");
                return;
            }
        }

        System.out.println("true");
    }

    public static void isConnected(ArrayList<Edge>[] graph, int src, boolean[] visited) {
        if (visited[src]) return;

        visited[src] = true;
        for (Edge e : graph[src]) {
            isConnected(graph, e.nbr, visited);
        }
    }
}
