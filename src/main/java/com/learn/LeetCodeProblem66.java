package com.learn;

public class LeetCodeProblem66 {
    public static void main(String[] args) {
        LeetCodeProblem66 l66=new LeetCodeProblem66();
        int[] nums = new int[]{1,3,5,6};
        int[] numsplus1=l66.plusOne(nums);
        System.out.println();
        for(int i=0;i<numsplus1.length;i++){
            System.out.print(" " + numsplus1[i]);
        }
        System.out.println();
    }
    public int[] plusOne(int[] digits) {
        boolean flag = true;
        int lastindex = digits.length - 1;
        int number = digits[lastindex];
        while (flag && lastindex >= 0) {
            if (number == 9) {
                digits[lastindex] = 0;
                lastindex = lastindex - 1;
                if (lastindex > -1)
                    number = digits[lastindex];
            } else {
                digits[lastindex] = number + 1;
                flag = false;
            }
        }
        if (flag) {
            int[] newdigits = new int[digits.length + 1];
            newdigits[0] = 1;
            return newdigits;
        } else {
            return digits;
        }
    }
}
