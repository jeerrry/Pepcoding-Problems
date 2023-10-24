package org.practice.recursion_and_backtracking;

import java.util.*;

public class RemoveInvalidParenthesis {
    public static void solution(String str, int minRemoval, HashSet<String> ans) {
        if (minRemoval == 0) {
            if (!ans.contains(str) && isValid(str)) {
                System.out.println(str);
                ans.add(str);
            }
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            String substring = str.substring(0, i) + str.substring(i + 1);
            solution(substring, minRemoval - 1, ans);
        }
    }

    public static int getMin(String str) {
        Stack<Character> stack = new Stack<>();
        for (char c : str.toCharArray()) {
            switch (c) {
                case '(':
                    stack.push('(');
                    break;
                case ')':
                    if (stack.size() > 0 && stack.peek() == '(') {
                        stack.pop();
                    } else {
                        stack.push(')');
                    }
                    break;
                default:
                    break;
            }
        }
        return stack.size();
    }

    public static boolean isValid(String str) {
        int count = 0;
        for (char c : str.toCharArray()) {
            if (c == '(') count++;
            else if (c == ')') {
                count--;
                if (count < 0) return false;
            }
        }

        return count == 0;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        solution(str, getMin(str), new HashSet<>());
    }
}
