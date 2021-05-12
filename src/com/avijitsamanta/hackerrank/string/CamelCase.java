package com.avijitsamanta.hackerrank.string;

/***
 * @author Avijit Samanta
 *
 * Question Link
 * https://www.hackerrank.com/challenges/camelcase/problem
 */
public class CamelCase {
    private static int camelcase(String s) {
        int c = 0;
        for (char ch : s.toCharArray()) {
            if (ch >= 65 && ch <= 90) c++;
        }
        return ++c;
    }

    public static void main(String[] args) {
        System.out.println(camelcase("saveChangesInTheZditor"));
    }
}
