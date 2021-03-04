package com.avijitsamanta.leetcode.array;

public class RemoveElement {
    private static int removeElement(int[] nums, int val) {
        int c = 0;
        for (int item : nums)
            if (val != item) nums[c++] = item;
        return c;
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
        System.out.println(removeElement(nums,2));
    }
}
