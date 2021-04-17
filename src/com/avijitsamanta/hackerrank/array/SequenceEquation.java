package com.avijitsamanta.hackerrank.array;

import java.util.HashMap;

/***
 * @author Avijit Samanta
 *
 * Question link
 * https://www.hackerrank.com/challenges/permutation-equation/problem
 */
public class SequenceEquation {

    private static int[] permutationEquation(int[] p) {
        int[] res = new int[p.length];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < p.length; i++)
            map.put(p[i], i + 1); // array value and location
        for (int i = 1; i <= p.length; i++) {
            res[i - 1] = map.get(map.get(i));
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {4, 3, 5, 1, 2};
        int[] res = permutationEquation(arr);
        for (int val : res)
            System.out.print(val + " ");
    }
}
