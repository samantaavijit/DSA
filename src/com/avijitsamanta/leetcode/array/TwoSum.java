package com.avijitsamanta.leetcode.array;

/***
 * @author Avijit Samanta
 *
 * Question link
 * https://leetcode.com/problems/two-sum/
 */
public class TwoSum {
    private static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++)
                if (nums[i] + nums[j] == target)
                    return new int[]{i, j};
        }

        throw new IllegalArgumentException("No two sum solution");
    }

    public static void main(String[] args) {
        int[] arr = { 2, 7, 11, 16 };
        for (int val:twoSum(arr,9))
            System.out.print(val+" ");
    }
}
