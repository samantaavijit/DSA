package com.avijitsamanta.hackertrank.array;

import java.util.Arrays;

/**
 * @author Avijit Samanta
 * <p>
 * Question link
 * https://www.hackerrank.com/challenges/the-hurdle-race/problem
 */
public class TheHurdleRace {
    private static int hurdleRace(int k, int[] height) {
        Arrays.sort(height);
        int max = height[height.length - 1];
        return max > k ? max - k : 0;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 6, 9, 10};
        System.out.println(hurdleRace(7,arr));
        System.out.println(hurdleRace(11,arr));
    }
}
