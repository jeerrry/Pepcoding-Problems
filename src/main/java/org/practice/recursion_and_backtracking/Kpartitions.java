package org.practice.recursion_and_backtracking;

import java.util.*;

public class Kpartitions {
    static int count = 0;

    public static void solution(int i, int n, int k, int rssf, ArrayList<ArrayList<Integer>> ans) {
        if (i > n) {
            if (rssf == ans.size()) {
                System.out.print(++count);
                for (var res : ans) {
                    System.out.print(". " + res);
                }
                System.out.println();
            }
            return;
        }

        for (int j = 0; j < ans.size(); j++) {
            ArrayList<Integer> paritions = ans.get(j);
            if (paritions.size() == 0) {
                paritions.add(i);
                solution(i + 1, n, k, rssf + 1, ans);
                paritions.remove(paritions.size() - 1);

                if (rssf == 0) return;
            } else {
                paritions.add(i);
                solution(i + 1, n, k, rssf, ans);
                paritions.remove(paritions.size() - 1);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            ans.add(new ArrayList<>());
        }
        solution(1, n, k, 0, ans);

    }
}
