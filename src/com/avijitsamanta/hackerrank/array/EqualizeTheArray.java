package com.avijitsamanta.hackerrank.array;

import java.util.Arrays;

/**
 * @author Avijit Samanta
 * <p>
 * Question link
 * https://www.hackerrank.com/challenges/equality-in-a-array/problem
 */
public class EqualizeTheArray {

    private static int equalizeArray(int[] arr) {
        int c = 1, max = 0;
        Arrays.sort(arr);
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) c++;
            else {
                max = Math.max(max, c);
                c = 1;
            }
        }
        max = Math.max(max, c);
        return arr.length - max;
    }

    public static void main(String[] args) {
        int[] arr = {3, 3, 2, 1, 3};
        System.out.println(equalizeArray(arr));
    }
}
