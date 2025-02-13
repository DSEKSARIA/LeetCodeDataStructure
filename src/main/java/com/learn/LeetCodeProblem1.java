package com.learn;
public class LeetCodeProblem1 {
    public static void main(String[] args) {
        LeetCodeProblem1 p1=new LeetCodeProblem1();
        int[] nums = new int[]{-1,-2,-3,-4,-5};
        int target = -8;
        System.out.println(p1.twoSum(nums,target).toString());
    }

    public int[] twoSum(int[] nums, int target) {
        int[] output=new int[2];
        for(int i=0;i<nums.length-1;i++){
            for(int j=1;j<nums.length;j++){
                if(i!=j&&nums[i]+nums[j]==target){
                    System.out.println("Values Found i ["+i+"] j ["+j+"]");
                    output[0]=i;
                    output[1]=j;
                    break;
                }
            }
        }
        return output;
    }

}
