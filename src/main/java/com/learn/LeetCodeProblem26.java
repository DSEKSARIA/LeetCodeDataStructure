package com.learn;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class LeetCodeProblem26 {
    public static void main(String[] args) {
        LeetCodeProblem26 l26 = new LeetCodeProblem26();
        int[] nums = new int[]{1, 1, 2};
        System.out.println(l26.removeDuplicates(nums));
    }

    public int removeDuplicates(int[] nums) {
        int j=0;
        for (int i = 1;i < nums.length; i++) {
            if(nums[i]!=nums[j]){
             j++;
             nums[j]=nums[i];
            }
        }
        return j+1;
    }
}
