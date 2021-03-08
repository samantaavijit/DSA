package com.avijitsamanta.hackertrank.array;

import java.util.HashMap;

/**
 * @author Avijit Samanta
 * <p>
 * Question link
 * https://www.hackerrank.com/challenges/migratory-birds/problem
 */
public class MigratoryBirds {

    static int migratoryBirds(int[] arr) {
        int max = 0;
        int[] countArray = new int[6];

        for (int val : arr) {
            countArray[val]++;
            max = Math.max(max, countArray[val]);
        }

        for (int i = 0; i < 6; i++) {
            if (countArray[i] == max) return i;
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] ar = {1, 4, 4, 4, 5, 3};
        System.out.println(migratoryBirds(ar));
    }
}
