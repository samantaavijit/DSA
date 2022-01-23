package com.avijitsamanta.gfg.string;

import java.util.Arrays;

/**
 * @author Avijit Samanta
 * <p>
 * Question Link
 * https://practice.geeksforgeeks.org/problems/rearrange-a-string4100/1
 */
public class RearrangeAString {
    private static String arrangeString(String s) {
        int sum = 0;
        String str = "";
        for (char c : s.toCharArray()) {
            if (c >= '0' && c <= '9') {
                sum += Integer.parseInt(c + "");
            } else str += c;
        }
        char[] arr = str.toCharArray();
        Arrays.sort(arr);
        return new String(arr) + sum;
    }

    public static void main(String[] args) {
        System.out.println(arrangeString("AC2BEW3"));
        System.out.println(arrangeString("ACCBA10D2EW30"));
    }
}
