package com.avijitsamanta.gfg.array;

public class BalancedArray {
    private static long minValueToBalance(long[] a, int n) {
        long lSum = 0, rSum = 0;
        int i = 0, j = n - 1;
        while (i < j) {
            lSum += a[i++];
            rSum += a[j--];
        }
        return Math.abs(lSum - rSum);
    }

    public static void main(String[] args) {
        long[] arr = {1, 2, 1, 2, 1, 3};
        System.out.println(minValueToBalance(arr, arr.length));
    }
}
