package org.practice;

import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        var defaultStream = System.out;

        // Make Calls Here

        System.setOut(defaultStream);
        if (validateOutput()) {
            System.out.println("Success");
            return;
        }
        System.out.println("Failed Cases");
    }

    private static boolean validateOutput() throws IOException {
        BufferedReader reader1 = new BufferedReader(new FileReader("input.txt"));
        BufferedReader reader2 = new BufferedReader(new FileReader("output.txt"));
        String line1 = reader1.readLine();
        String line2 = reader2.readLine();
        int lineNum = 1;
        boolean areEqual = true;
        while (line1 != null || line2 != null) {
            if (line1 == null || line2 == null) {
                areEqual = false;
                break;
            } else if (!line1.equalsIgnoreCase(line2)) {
                areEqual = false;
                break;
            }
            line1 = reader1.readLine();
            line2 = reader2.readLine();
            lineNum++;
        }

        reader1.close();
        reader2.close();

        return areEqual;
    }

}