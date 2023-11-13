package org.practice.graph;

import java.util.*;
import java.io.*;

public class KruskalAlgorithm {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int v = Integer.parseInt(br.readLine());
        int e = Integer.parseInt(br.readLine());

        int[][] edges = new int[e][3];
        for (int i = 0; i < e; i++) {
            String[] st = br.readLine().split(" ");
            edges[i][0] = Integer.parseInt(st[0]);
            edges[i][1] = Integer.parseInt(st[1]);
            edges[i][2] = Integer.parseInt(st[2]);
        }

        System.out.println(minCostToSupplyWater(v, edges));
    }

    static int[] parent;
    static int[] rank;


    public static int minCostToSupplyWater(int n, int[][] edges) {
        parent = new int[n];
        rank = new int[n];

        Pair[] pairs = new Pair[edges.length];
        for (int i = 0; i < edges.length; i++) {
            Pair p = new Pair(edges[i][0], edges[i][1], edges[i][2]);
            pairs[i] = p;
        }
        Arrays.sort(pairs);

        for (int i = 0; i < n; i++) {
            parent[i] = i;
            rank[i] = 0;
        }

        int ans = 0;
        for (Pair pair : pairs) {
            boolean flag = union(pair.u, pair.v);
            ans += (flag ? pair.wt : 0);
        }

        return ans;
    }

    private static int find(int x) {
        if (parent[x] == x) {
            return x;
        }

        parent[x] = find(parent[x]);
        return parent[x];
    }

    private static boolean union(int x, int y) {
        int lx = find(x);
        int ly = find(y);

        if (lx != ly) {
            if (rank[lx] > rank[ly]) {
                parent[ly] = lx;
            } else if (rank[lx] < rank[ly]) {
                parent[lx] = ly;
            } else {
                parent[ly] = lx;
                rank[lx] += 1;
            }
            return true;
        } else {
            return false;
        }
    }

    public static class Pair implements Comparable<Pair> {
        int u;
        int v;
        int wt;

        Pair(int u, int v, int wt) {
            this.u = u;
            this.v = v;
            this.wt = wt;
        }

        @Override
        public int compareTo(Pair o) {
            return this.wt - o.wt;
        }
    }
}
