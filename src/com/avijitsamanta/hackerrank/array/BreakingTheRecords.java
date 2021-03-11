package com.avijitsamanta.hackerrank.array;

/**
 * @author Avijit Samanta
 * <p>
 * <p>
 * Question link
 * https://www.hackerrank.com/challenges/breaking-best-and-worst-records/problem
 */
public class BreakingTheRecords {
    private static int[] breakingRecords(int[] scores) {
        int maxS = scores[0], minS = scores[0];
        int[] res = new int[2]; // 0 for highest 1 for lowest

        for (int i = 1; i < scores.length; i++) {
            if (maxS < scores[i]) {
                maxS = scores[i];
                res[0]++;
            } else if (minS > scores[i]) {
                minS = scores[i];
                res[1]++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] a = {3, 4, 21, 36, 10, 28, 35, 5, 24, 42};
        for (int val : breakingRecords(a))
            System.out.print(val + " ");
    }
}
