package com.learn;

import java.util.Arrays;

public class LeetCodeProblem27 {

    public static void main(String[] args) {
        LeetCodeProblem27 l27 = new LeetCodeProblem27();
        int[] nums = new int[]{3, 3, 2, 2};
        int val = 3;
        System.out.println(l27.removeElement(nums, val));
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]+" ");
        }
    }

    public int removeElement(int[] nums, int val) {
        int length = nums.length;
        int j = 0;
        for (int i = 0; i < length; ) {
            if (nums[i] == val) {
                j++;
                for (int k = i; k < length - 1; k++) {
                    nums[k] = nums[k + 1];
                }
                length--;

            } else
                i++;
        }
        return nums.length - j;

    }
}
