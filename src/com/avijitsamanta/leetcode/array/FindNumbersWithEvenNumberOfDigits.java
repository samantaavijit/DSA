package com.avijitsamanta.leetcode.array;

/**
 * @author Avijit Samanta
 * <p>
 * Question link
 * https://leetcode.com/explore/learn/card/fun-with-arrays/521/introduction/3237/
 */
public class FindNumbersWithEvenNumberOfDigits {
    private static int findNumbers(int[] nums) {
        int c = 0;
        for (int val : nums) {
            String str = String.valueOf(val);
            if (isEven(str)) {
                c++;
            }
        }
        return c;
    }

    private static boolean isEven(String str) {
        return str.length() % 2 == 0;
    }

    public static void main(String[] args) {
        int[] nums = {12, 345, 2, 6, 7896};
        System.out.println(findNumbers(nums));
    }
}
