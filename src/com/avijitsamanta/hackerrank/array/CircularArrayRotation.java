package com.avijitsamanta.hackerrank.array;

/**
 * @author Avijit Samanta
 * <p>
 * Question link
 * https://www.hackerrank.com/challenges/circular-array-rotation/problem
 */

public class CircularArrayRotation {
    private static int[] circularArrayRotation(int[] a, int k, int[] queries) {
        int n = a.length;
        k %= n;
        System.out.println(n);
        for (int i = 0; i < queries.length; i++) {
            int pos = (queries[i] - k + n) % n;
            queries[i] = a[pos];
        }
        return queries;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] res = circularArrayRotation(a, 3, new int[]{0, 3, 6, 7, 8});
        for (int val : res)
            System.out.print(val + " ");
    }
}
