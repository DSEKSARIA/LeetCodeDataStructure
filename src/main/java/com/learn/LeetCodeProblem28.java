package com.learn;

public class LeetCodeProblem28 {
    public static void main(String[] args) {
        LeetCodeProblem28 l28 = new LeetCodeProblem28();
        String haystack = "butsaad", needle = "sad";
        System.out.println(l28.strStr(haystack, needle));
    }

    public int strStr(String haystack, String needle) {
        int index = -1;
        boolean flag = false;
        int i = 0;
        for (; i < haystack.length(); i++) {
            if (haystack.substring(i).startsWith(needle)) {
                flag = true;
                break;
            }
        }
        if (flag)
            index = i;
        return index;
    }
}
