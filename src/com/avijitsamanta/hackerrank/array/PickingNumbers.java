package com.avijitsamanta.hackerrank.array;

import java.util.Arrays;

/**
 * @author Avijit Samanta
 * <p>
 * Question link
 * https://www.hackerrank.com/challenges/picking-numbers/problem
 */
public class PickingNumbers {
    private static int pickingNumbers(int[] a) {
        Arrays.sort(a);
        int c, max = -1;
        for (int i = 0; i < a.length; i++) {
            c = 1;
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j] || a[i] == a[j] + 1 || a[i] == a[j] - 1)
                    c++;
                else break;
            }
            max = Math.max(max, c);
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 1, 2, 3, 4};
        System.out.println(pickingNumbers(arr));
    }
}
