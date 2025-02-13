package com.learn;

public class LeetCodeProblem35 {
    public static void main(String[] args) {
        LeetCodeProblem35 l35=new LeetCodeProblem35();
        int[] nums = new int[]{1,3,5,6};
        int target = 5;
        System.out.println(l35.searchInsert(nums,target));
    }
    public int searchInsert(int[] nums, int target) {
        int position = 0;
        int value=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                value=i;
                break;
            }
            if (nums[i]<target){
                position++;
            }
        }
        if (value==-1)
            return position;
        else
            return value;
    }
}
