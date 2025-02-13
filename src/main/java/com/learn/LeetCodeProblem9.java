package com.learn;

public class LeetCodeProblem9 {
    public static void main(String[] args) {
        LeetCodeProblem9 leetCodeProblem9 = new LeetCodeProblem9();
        System.out.println(leetCodeProblem9.isPalindrome(1221));
        System.out.println(leetCodeProblem9.isPalindrome(121));
        System.out.println(leetCodeProblem9.isPalindrome(1212));
        System.out.println(leetCodeProblem9.isPalindrome(11));
        System.out.println(leetCodeProblem9.isPalindrome(1));
    }

    public boolean isPalindromeString(int x) {
        boolean flag = true;
        String xString = String.valueOf(x);
        int length = xString.length();
        for (int i = 0, j = length - 1; i < length / 2; i++, j--) {
            if (xString.charAt(i) != xString.charAt(j)) {
                flag = false;
                break;
            }
        }
        return flag;
    }

    public boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }
        int newint = 0;
        while (x > newint) {
            newint = newint * 10 + x % 10;
            x = x / 10;
        }
        return newint == x || (newint / 10) == x;
    }
}
