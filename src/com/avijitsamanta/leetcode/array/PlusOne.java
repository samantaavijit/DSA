package com.avijitsamanta.leetcode.array;

/**
 * @author Avijit Samanta
 * <p>
 * Question link
 * https://leetcode.com/problems/plus-one/
 */
public class PlusOne {

    private static int[] plusOne(int[] digits) {
        int index;
        for (index = digits.length - 1; index >= 0 && digits[index] == 9; index--)
            digits[index] = 0;

        if (index == -1) {
            int[] newDigits = new int[digits.length + 1];
            newDigits[0] = 1;
            return newDigits;
        }
        digits[index]++;
        return digits;
    }

    public static void main(String[] args) {
        for (int val : plusOne(new int[]{1, 2, 3}))
            System.out.print(val + " ");
        System.out.println();
        for (int val : plusOne(new int[]{9, 9, 9}))
            System.out.print(val + " ");
    }
}
