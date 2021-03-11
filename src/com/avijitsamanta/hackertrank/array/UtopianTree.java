package com.avijitsamanta.hackertrank.array;

/**
 * @author Avijit Samanta
 * <p>
 * Question link
 * https://www.hackerrank.com/challenges/utopian-tree/problem
 */
public class UtopianTree {
    private static int utopianTree(int n) {
        int h = 0;
        for (int i = 0; i <= n; i++)
            if (i % 2 == 0) h++;
            else h *= 2;
        return h;
    }

    public static void main(String[] args) {
        System.out.println(utopianTree(5));
        System.out.println(utopianTree(25));
    }
}
