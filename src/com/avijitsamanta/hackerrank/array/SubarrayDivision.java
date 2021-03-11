package com.avijitsamanta.hackerrank.array;

/***
 * @author Avijit Samanta
 *
 *
 * Question link
 * https://www.hackerrank.com/challenges/the-birthday-bar/problem
 */
public class SubarrayDivision {
    private static int birthday(int[] s, int d, int m) {
        int ways = 0, sum;
        for (int i = 0; i <= s.length - m; i++) {
            sum = 0;
            for (int j = i; j < i + m; j++) {
                sum += s[j];
            }
            if (sum == d) ways++;
        }
        return ways;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 3, 2};
        int d = 3, m = 2;
        System.out.println(birthday(arr, d, m));
    }
}
