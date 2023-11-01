package org.practice.graph;

import java.io.*;
import java.util.*;

public class HamiltonianPathAndCycle {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int vtces = Integer.parseInt(br.readLine());
        ArrayList<int[]>[] graph = new ArrayList[vtces];
        for (int i = 0; i < vtces; i++) {
            graph[i] = new ArrayList<>();
        }

        int edges = Integer.parseInt(br.readLine());
        for (int i = 0; i < edges; i++) {
            String[] parts = br.readLine().split(" ");
            int v1 = Integer.parseInt(parts[0]);
            int v2 = Integer.parseInt(parts[1]);
            int wt = Integer.parseInt(parts[2]);
            graph[v1].add(new int[]{v1, v2, wt});
            graph[v2].add(new int[]{v2, v1, wt});
        }

        int src = Integer.parseInt(br.readLine());
        printPaths(graph, src, src, new HashSet<Integer>(), src + "");

    }

    public static void printPaths(ArrayList<int[]>[] graph, int osrc, int src, HashSet<Integer> visited, String psf) {
        if (visited.size() == graph.length - 1) {
            System.out.print(psf);

            boolean isCycle = false;
            for (var edge : graph[src]) {
                if (edge[1] == osrc) {
                    isCycle = true;
                    break;
                }
            }

            System.out.println(isCycle ? "*" : ".");

            return;
        }

        visited.add(src);
        for (var edge : graph[src]) {
            if (visited.contains(edge[1])) continue;

            printPaths(graph, osrc, edge[1], visited, psf + edge[1]);
        }

        visited.remove(src);
    }
}
