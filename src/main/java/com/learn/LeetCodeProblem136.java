package com.learn;

import java.util.ArrayList;
import java.util.Arrays;

public class LeetCodeProblem136 {
    public static void main(String[] args) {
        LeetCodeProblem136 l = new LeetCodeProblem136();
        //int[] nums = new int[]{2, 2, 1};
        int[] nums = new int[]{1, 3, 1, -1, 3};
        //int[] nums = new int[]{1, 0, 1};
        //int[] nums = new int[]{4,1,2,1,2};
        System.out.println(l.singleNumber(nums));
    }

    public int singleNumber(int[] nums) {
        int n = nums.length;
        if(n == 1) return nums[0];
        Arrays.sort(nums);
        for(int i = 0; i < n - 1; i += 2) {
            if(nums[i] != nums[i + 1]) {
                return nums[i];
            }
        }
        return nums[n - 1];
    }
}
