package com.avijitsamanta.hackerrank.others;

/**
 * @author Avijit Samanta
 * <p>
 * Question link
 * https://www.hackerrank.com/challenges/beautiful-days-at-the-movies/problem
 */
public class BeautifulDaysAtTheMovies {
    private static int reverse(String s) {
        return Integer.parseInt(new StringBuilder(s).reverse().toString());
    }

    private static int beautifulDays(int i, int j, int k) {
        int c = 0;
        for (; i <= j; i++)
            if ((i - reverse(i + "")) % k == 0) c++;
        return c;
    }

    public static void main(String[] args) {
        System.out.println(beautifulDays(20, 23, 6));
    }
}
