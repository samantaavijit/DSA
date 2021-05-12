package com.avijitsamanta.hackerrank.others;

/**
 * @author Avijit Samanta
 * <p>
 * Question Link
 * https://www.hackerrank.com/challenges/append-and-delete/problem
 */
public class AppendAndDelete {
    private static String appendAndDelete(String s, String t, int k) {
//        if (s.equals(t)) return "Yes";
//        StringBuilder str = new StringBuilder();
//        int i = 0;
//        for (; i < (Math.min(s.length(), t.length())); i++) {
//            if (s.charAt(i) == t.charAt(i)) str.append(s.charAt(i));
//            else break;
//        }
//        int c = s.length() - str.length();
//        if (str.toString().equals(t) && c <= k) return "Yes";
//        else {
//            while (i < t.length() && c <= k) {
//                str.append(t.charAt(i));
//                i++;
//                c++;
//                if (str.toString().equals(t)) return "Yes";
//            }
//            return "No";
//        }

        if (s.equals(t))
            return (k >= s.length() * 2 || k % 2 == 0) ? "Yes" : "No";

        int commonlength = 0;

        for (int i = 0; i < Math.min(s.length(), t.length()); i++) {
            if (t.charAt(i) != s.charAt(i))
                break;
            commonlength++;
        }

        int cs = s.length() - commonlength;
        int ct = t.length() - commonlength;
        int tot = cs + ct;

        return ((tot == k) || (tot < k && (tot - k) % 2 == 0) || (tot + (2 * commonlength) <= k)) ? "Yes" : "No";
    }

    public static void main(String[] args) {
        System.out.println(appendAndDelete("hackerhappy", "hackerrank", 9));
        System.out.println(appendAndDelete("aba", "aba", 7));
        System.out.println(appendAndDelete("abcd", "abcdert", 10));
    }
}
