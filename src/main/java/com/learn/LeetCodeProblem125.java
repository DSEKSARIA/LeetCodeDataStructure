package com.learn;

public class LeetCodeProblem125 {
    public static void main(String[] args) {
        LeetCodeProblem125 l121 = new LeetCodeProblem125();
        String s = "A man, a plan, a canal: Panama";
        //String s="abba";
        System.out.println(l121.isPalindrome(s));
    }

    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        s = s.replaceAll("[^a-z0-9]", "");
        int len = s.length();
        if(len==0){
            return true;
        }
        String reverseString = "";
        for (int i = s.length()-1; i >= (len / 2)+(len % 2); i--) {
            reverseString += s.charAt(i);
        }

        if (reverseString.equals(s.substring(0, len / 2))) {
            return true;
        }else{
            return false;
        }
    }
}
