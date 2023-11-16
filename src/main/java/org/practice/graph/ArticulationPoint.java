package org.practice.graph;

import java.util.*;

public class ArticulationPoint {
    static int[] prt;
    static int[] dis;
    static int[] low;
    static int[] art;
    static boolean[] vis;
    static int time = 0;

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int vtx = scn.nextInt();
        int edg = scn.nextInt();

        ArrayList<Integer>[] graph = new ArrayList[vtx];
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < edg; i++) {
            int src = scn.nextInt() - 1;
            int tar = scn.nextInt() - 1;

            graph[src].add(tar);
        }

        prt = new int[vtx];
        dis = new int[vtx];
        low = new int[vtx];
        art = new int[vtx];
        vis = new boolean[vtx];
        time = 0;

        prt[0] = -1;
        dfs(0, graph);

        int count = 0;
        for(int ar : art) {
            count += ar;
        }

        System.out.println(count);
    }

    static void dfs(int src, ArrayList<Integer>[] graph) {
        dis[src] = low[src] = time++;
        vis[src] = true;
        int count = 0;

        for (int nbr : graph[src]) {
            if(prt[src] == nbr) continue;
            if(vis[nbr]){
                low[src] = Math.min(low[src], dis[nbr]);
            }else {
                prt[nbr] = src;
                count++;
                dfs(nbr, graph);
                low[src] = Math.min(low[src], low[nbr]);
                if(prt[src] == -1) {
                    art[src] = count > 1 ? 1 : 0;
                }else {
                    art[src] = low[nbr] >= dis[src] ? 1 : 0;
                }
            }
        }
    }
}
