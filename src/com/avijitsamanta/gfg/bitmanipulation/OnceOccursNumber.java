package com.avijitsamanta.gfg.bitmanipulation;

/**
 * @author Avijit Samanta
 * <p>
 * Question link
 * https://practice.geeksforgeeks.org/problems/element-appearing-once2552/1#
 */
public class OnceOccursNumber {
    private static int search(int[] A, int N) {
        int ans = A[0];
        int i = 1, j = N - 1;
        while (i <= j) {
            ans ^= A[i];
            ans ^= A[j];
            i++;
            j--;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] a = {1, 1, 2, 5, 5};
        System.out.println(search(a, a.length));
    }
}
