package com.avijitsamanta.hackertrank.array;

/**
 * @author Avijit Samanta
 * <p>
 * Question link
 * https://www.hackerrank.com/challenges/electronics-shop/problem
 */
public class ElectronicsShop {
    private static int getMoneySpent(int[] keyboards, int[] drives, int b) {
        int max = -1;
        for(int i = 0, j = 0; i < keyboards.length; i++){
            for(; j < drives.length; j++){
                if(keyboards[i]+drives[j] > b) break;
                if(keyboards[i]+drives[j] > max)
                    max = keyboards[i]+drives[j];
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
