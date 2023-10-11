package org.practice.recursion_and_backtracking;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Combinations_2 {
    public static void combinations(int[] boxes, int ci, int ti, int lb) {
        // write your code here
        if (ci > ti) {
            StringBuilder result = new StringBuilder();
            for (int val : boxes) result.append(val > 0 ? "i" : "-");
            System.out.println(result);
            return;
        }

        for (int i = lb + 1; i < boxes.length; i++) {
            if (boxes[i] > 0) continue;

            boxes[i] = 1;
            combinations(boxes, ci + 1, ti, i);
            boxes[i] = 0;
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int nboxes = Integer.parseInt(br.readLine());
        int ritems = Integer.parseInt(br.readLine());
        combinations(new int[nboxes], 1, ritems, -1);
    }
}
