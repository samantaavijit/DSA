package com.avijitsamanta.hackertrank.array;

/**
 * @author Avijit Samanta
 * <p>
 * Question link
 * https://www.hackerrank.com/challenges/angry-professor/problem
 */
public class AngryProfessor {
    private static String angryProfessor(int k, int[] a) {
        int c = 0;
        for (int val : a) if (val <= 0) c++;
        return c >= k ? "NO" : "YES";
    }

    public static void main(String[] args) {
        int[] arr = {-1, -3, 4, 2};
        System.out.println(angryProfessor(3,arr));
    }
}
