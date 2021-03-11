package com.avijitsamanta.hackerrank.array;

/**
 * @author Avijit Samanta
 * <p>
 * Question link
 * https://www.hackerrank.com/challenges/electronics-shop/problem
 */
public class ElectronicsShop {
    private static int getMoneySpent(int[] keyboards, int[] drives, int b) {
        int max = -1;
        for (int keyboard : keyboards) {
            for (int drive : drives) {
                if (keyboard + drive <= b) {
                    max = Math.max(max, keyboard + drive);
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] keyboard = {3, 1};
        int[] drives = {5, 2, 8};
        int amount = 10;
        System.out.println(getMoneySpent(keyboard, drives, amount));
    }
}
