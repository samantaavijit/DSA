package com.avijitsamanta.gfg.array;

/**
 * @author Avijit Samanta
 * <p>
 * <p>
 * Question link
 * https://practice.geeksforgeeks.org/problems/sum-of-array-elements2502/1/?category[]=Arrays&category[]=Arrays&problemStatus=solved&page=1&query=category[]ArraysproblemStatussolvedpage1category[]Arrays#
 */
public class SumOfArrayElements {
    public static int sumElement(int[] arr, int n) {
        n = 0;
        for (int val : arr)
            n += val;
        return n;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        System.out.println(sumElement(a, a.length));
    }
}
