package com.avijitsamanta.hackerrank.string;

/**
 * @author Avijit Samanta
 * <p>
 * Question Link
 * https://www.hackerrank.com/challenges/append-and-delete/problem
 */
public class AppendAndDelete {
    private static String appendAndDelete(String s, String t, int k) {
        int commonLength = 0;
        for (int i = 0; i < Math.min(s.length(), t.length()); i++) {
            if (t.charAt(i) != s.charAt(i))
                break;
            commonLength++;
        }
        int minOperationRequired = s.length() + t.length() - 2 * commonLength;
        if (k < minOperationRequired) return "No";
        if (k >= s.length() + t.length()) return "Yes";
        if ((k - minOperationRequired) % 2 == 0) return "Yes";
        else return "No";
    }

    public static void main(String[] args) {
        System.out.println(appendAndDelete("hackerhappy", "hackerrank", 9));
        System.out.println(appendAndDelete("aba", "aba", 7));
        System.out.println(appendAndDelete("abcd", "abcdert", 10));
    }
}
