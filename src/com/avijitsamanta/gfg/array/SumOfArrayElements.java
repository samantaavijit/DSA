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
        int i = 0, j = n - 1, sum = 0;

        while (i < j) {
            sum += arr[i] + arr[j];
            i++;
            j--;
        }
        if ((n & 1) == 1)
            sum += arr[j];
        return sum;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        System.out.println(sumElement(a, a.length));
    }
}
