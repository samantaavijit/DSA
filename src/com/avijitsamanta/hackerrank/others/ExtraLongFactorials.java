package com.avijitsamanta.hackerrank.others;

import java.math.BigInteger;

/***
 * @author Avijit Samanta
 *
 * Question link
 * https://www.hackerrank.com/challenges/extra-long-factorials/problem
 */
public class ExtraLongFactorials {
    private static void extraLongFactorials(int n) {
        BigInteger fact = BigInteger.valueOf(1);
        for (int i = 1; i <= n; i++)
            fact = fact.multiply(BigInteger.valueOf(i));
        System.out.println(fact);
    }

    public static void main(String[] args) {
        extraLongFactorials(3);
        extraLongFactorials(25);
    }
}
