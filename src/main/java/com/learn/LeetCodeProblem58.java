package com.learn;

public class LeetCodeProblem58 {
    public static void main(String[] args) {
        LeetCodeProblem58 l58=new LeetCodeProblem58();
        String s="luffy is still joyboy";
        System.out.println(l58.lengthOfLastWord(s));
    }
    public int lengthOfLastWord(String s) {
        int length1 = 0;
        if (!s.isEmpty()) {
            String[] sarray = s.split(" ");
            length1=sarray[sarray.length-1].length();
        }
        return length1;
    }
}
