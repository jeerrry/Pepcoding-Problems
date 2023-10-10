package org.practice.recursion_and_backtracking;

import java.io.*;
import java.util.*;

public class Permutation_1 {
    public static void permutations(int[] boxes, int ci, int ti){
        // write your code here
        if(ci > ti){
            System.out.println(Arrays.toString(boxes));
            return;
        }

        for(int i=0; i<boxes.length; i++) {
            if(boxes[i] > 0) continue;
            boxes[i] = ci;
            permutations(boxes, ci + 1, ti);
            boxes[i] = 0;
        }
    }

    public void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int nboxes = Integer.parseInt(br.readLine());
        int ritems = Integer.parseInt(br.readLine());
        permutations(new int[nboxes], 1, ritems);
    }
}
