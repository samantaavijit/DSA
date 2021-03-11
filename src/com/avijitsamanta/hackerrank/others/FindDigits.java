package com.avijitsamanta.hackerrank.others;

/**
 * @author Avijit Samanta
 * <p>
 * Question link
 * https://www.hackerrank.com/challenges/find-digits/problem
 */
public class FindDigits {
    private static int findDigits(int n) {
        int c = 0, a = n, d;
        while (a > 0) {
            d = a % 10;
            if (d != 0 && n % d == 0) c++;
            a /= 10;
        }
        return c;
    }

    public static void main(String[] args) {
        System.out.println(findDigits(1012));
    }
}
