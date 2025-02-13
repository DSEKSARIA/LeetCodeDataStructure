package com.learn;

import java.math.BigInteger;
import java.util.PriorityQueue;

public class LeetCodePrblem3066 {


    public static void main(String[] args) {
        LeetCodePrblem3066 leetCodePrblem3066 = new LeetCodePrblem3066();
        leetCodePrblem3066.minOperations(new int[]{1000000000,999999999,1000000000,999999999,1000000000,999999999}, 1000000000 );
    }

    public int minOperations(int[] nums, int k) {
        PriorityQueue<BigInteger> doublePriorityQueue=new PriorityQueue<>();
        for(int i=0;i<nums.length;i++){
            doublePriorityQueue.add(BigInteger.valueOf(nums[i]));
        }
        int count = 0;
        System.out.println("asd"+doublePriorityQueue);
        while (doublePriorityQueue.peek().compareTo(BigInteger.valueOf(k))<0 && doublePriorityQueue.size() >= 2) {
            BigInteger x = doublePriorityQueue.poll();
            BigInteger y = doublePriorityQueue.poll();

            doublePriorityQueue.add(getFormalResult(x, y));
            System.out.println("asd"+doublePriorityQueue);
            count++;
        }
        System.out.println(count);
        return count;
    }

    public BigInteger getFormalResult(BigInteger x, BigInteger y) {
        return x.min(y).multiply(BigInteger.valueOf(2)).add(x.max(y));
    }
}
