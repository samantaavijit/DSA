package com.avijitsamanta.hackerrank.array;

/**
 * @author Avijit Samanta
 * <p>
 * Question link
 * https://www.hackerrank.com/challenges/jumping-on-the-clouds-revisited/problem
 */
public class JumpingOnTheClouds {
    private static int jumpingOnClouds(int[] c, int k) {
        int n = c.length, energy = 100, i;
        i = k % n;
        energy -= c[i] * 2 + 1;
        while (i != 0) {
            i = (i + k) % n;
            energy -= c[i] * 2 + 1;
        }
        return energy;
    }

    public static void main(String[] args) {
        int[] c = {0, 0, 1, 0, 0, 1, 1, 0};
        System.out.println(jumpingOnClouds(c, 2));
    }
}
