package com.avijitsamanta.leetcode.array;

/**
 * @author Avijit Samanta
 * <p>
 * Question link
 * https://leetcode.com/problems/merge-sorted-array/
 */
public class MergeSortedArray {
    private static void merge(int[] nums1, int m, int[] nums2, int n) {
        int p = m - 1;
        int q = n - 1;
        int k = m + n - 1;

        while (q >= 0 && p >= 0) {
            if (nums1[p] < nums2[q]) nums1[k--] = nums2[q--];
            else nums1[k--] = nums1[p--];
        }

        while (q >= 0)
            nums1[k--] = nums2[q--];
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 0, 0, 0, 0};
        int[] arr2 = {2, 8, 9, 15};
        merge(arr, arr.length - arr2.length, arr2, arr2.length);
        for (int val : arr)
            System.out.print(val + " ");
    }
}
