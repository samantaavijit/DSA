package com.avijitsamanta.gfg.string;

import java.util.Arrays;

/**
 * @author Avijit Samanta
 * Question link
 * https://practice.geeksforgeeks.org/problems/anagram-of-string/1
 */

public class AnagramOfString {

    private static int remAnagrams(String s, String s1) {
        int count = 0;
        int[] arr = new int[26];

        for (char c : s.toCharArray()) arr[c - 97]++;

        for (char c : s1.toCharArray()) arr[c - 97]--;

        for (int val : arr) if (val != 0) count += Math.abs(val);

        return count;
    }

    public static void main(String[] args) {
        System.out.println(remAnagrams("bcadeh", "hea"));
        System.out.println(remAnagrams("cddgk", "gcd"));
    }
}
