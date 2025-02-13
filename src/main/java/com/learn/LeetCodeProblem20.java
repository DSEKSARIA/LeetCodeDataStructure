package com.learn;

import java.util.Stack;

public class LeetCodeProblem20 {
    public static void main(String[] args) {
        LeetCodeProblem20 l20 = new LeetCodeProblem20();
        System.out.println(l20.isValid("([])"));
    }

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        boolean flag = true;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '}') {
                if (!stack.empty()) {
                    char chnew = stack.pop();
                    if (chnew != '{') {
                        flag = false;
                        break;
                    }
                } else {
                    flag = false;
                    break;
                }

            } else if (ch == ']') {
                if (!stack.empty()) {
                    char chnew = stack.pop();
                    if (chnew != '[') {
                        flag = false;
                        break;
                    }
                } else {
                    flag = false;
                    break;
                }
            } else if (ch == ')') {
                if (!stack.empty()) {
                    char chnew = stack.pop();
                    if (chnew != '(') {
                        flag = false;
                        break;
                    }
                } else {
                    flag = false;
                    break;
                }
            } else {
                stack.add(s.charAt(i));
            }


        }
        return flag && stack.empty();
    }
}
