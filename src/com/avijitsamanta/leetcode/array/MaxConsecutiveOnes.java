package com.avijitsamanta.leetcode.array;

/**
 * @author Avijit Samanta
 * Question link
 * https://leetcode.com/explore/featured/card/fun-with-arrays/521/introduction/3238/
 */
public class MaxConsecutiveOnes {
    private static int findMaxConsecutiveOnes(int[] nums) {
        int c = 0;
        int max = Integer.MIN_VALUE;
        for (int val : nums) { // for each loop
            if (val == 0) {
                max=Math.max(c,max);
                c = 0;
            } else {
                c++;
            }
        }
        max=Math.max(c,max);
        return max;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 0, 1, 1, 1};
        System.out.println(findMaxConsecutiveOnes(nums));
    }
}
