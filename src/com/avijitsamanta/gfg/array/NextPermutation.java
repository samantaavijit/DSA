package com.avijitsamanta.gfg.array;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Avijit Samanta
 * <p>
 * Question Link
 * https://practice.geeksforgeeks.org/problems/next-permutation5226/1
 */

public class NextPermutation {
    static List<Integer> nextPermutation(int n, int[] arr) {
        int i;
        List<Integer> ans = new ArrayList<>();
        for (i = n - 2; i >= 0; i--) {
            if (arr[i] < arr[i + 1])
                break;
        }
        if (i == -1) {
            i = 0;
            n -= 1;
            while (i <= n) {
                int v = arr[i];
                arr[i] = arr[n];
                arr[n] = v;
                i++;
                n--;
            }
            for (int var : arr)
                ans.add(var);
            return ans;
        } else {
            int k = i;
            for (i = n - 1; i >= k; i--)
                if (arr[i] > arr[k])
                    break;

            int l = i;
            int temp = arr[k];
            arr[k] = arr[l];
            arr[l] = temp;
            k++;
            n -= 1;
            while (k <= n) {
                int v = arr[k];
                arr[k] = arr[n];
                arr[n] = v;
                k++;
                n--;
            }
            for (int var : arr)
                ans.add(var);
            return ans;
        }
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 6, 5, 4};
        System.out.println(nextPermutation(a.length, a));
    }
}
