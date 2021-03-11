package com.avijitsamanta.hackerrank.array;

/***
 * @author Avijit Samanta
 *
 *
 * Question link
 * https://www.hackerrank.com/challenges/between-two-sets/problem
 */
public class BetweenTwoSets {
    private static int getTotalX(int[] a, int[] b) {
        int n = a.length;
        int x = a[n - 1], count = 0;
        boolean flag;

        while (x <= b[0]) {
            flag = false;
            for (int k : a) {
                if (x % k != 0) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                for (int j : b) {
                    if (j % x != 0) {
                        flag = true;
                        break;
                    }
                }
            }

            if (!flag) count++;
            x++;
        }
        return count;
    }

    public static void main(String[] args) {
        int[] a = {2, 4};
        int[] b = {16, 32, 96};
        System.out.println(getTotalX(a, b));
    }
}
