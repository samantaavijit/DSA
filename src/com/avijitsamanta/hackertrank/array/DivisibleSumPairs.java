package com.avijitsamanta.hackertrank.array;

import java.util.HashMap;

/**
 * @author Avijit Samanta
 * <p>
 * Question link
 * https://www.hackerrank.com/challenges/divisible-sum-pairs/problem
 */

public class DivisibleSumPairs {
    private static int divisibleSumPairs(int n, int k, int[] ar) {
        int pairs = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int item : ar) {
            int mod = item % k;
            int component = k - mod == k ? 0 : k - mod;

            if (map.containsKey(component))
                pairs += map.get(component);

            if (map.containsKey(mod))
                map.put(mod, map.get(mod) + 1);
            else
                map.put(mod, 1);
        }
        return pairs;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 6, 1, 2};
        System.out.println(divisibleSumPairs(arr.length,3,arr));
    }
}
