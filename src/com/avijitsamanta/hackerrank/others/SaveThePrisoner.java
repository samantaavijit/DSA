package com.avijitsamanta.hackerrank.others;

/***
 * @author Avijit Samanta
 *
 * Question link
 * https://www.hackerrank.com/challenges/save-the-prisoner/problem
 */
public class SaveThePrisoner {

    private static int saveThePrisoner(int n, int m, int s) {
        s = (s + m - 1) % n;
        if (s == 0) s = n;
        return s;
    }

    public static void main(String[] args) {
        System.out.println(saveThePrisoner(4, 6, 2));
        System.out.println(saveThePrisoner(3, 7, 3));
    }
}
