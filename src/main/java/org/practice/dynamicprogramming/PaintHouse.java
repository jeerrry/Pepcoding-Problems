package org.practice.dynamicprogramming;

import java.util.Scanner;

public class PaintHouse {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[][] vals = new int[3][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                vals[j][i] = scn.nextInt();
            }
        }

        int rcost = vals[0][0];
        int gcost = vals[1][0];
        int bcost = vals[2][0];

        for (int i = 1; i < n; i++) {
            int nrcost = vals[0][i] + Math.min(gcost, bcost);
            int ngcost = vals[1][i] + Math.min(rcost, bcost);
            int nbcost = vals[2][i] + Math.min(rcost, gcost);

            rcost = nrcost;
            gcost = ngcost;
            bcost = nbcost;
        }

        System.out.println(Math.min(rcost, Math.min(gcost, bcost)));
    }
}
