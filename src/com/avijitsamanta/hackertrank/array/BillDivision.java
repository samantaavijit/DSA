package com.avijitsamanta.hackertrank.array;

/**
 * @author Avijit Samanta
 * <p>
 * Question link
 * https://www.hackerrank.com/challenges/bon-appetit/problem
 */
public class BillDivision {
    private static void bonAppetit(int[] bill, int k, int b) {
        int cost = 0;
        for (int val : bill)
            cost += val;
        cost -= bill[k];
        cost /= 2;
        if (cost == b) System.out.println("Bon Appetit");
        else System.out.println((b - cost));
    }

    public static void main(String[] args) {
        int[] arr = {3, 10, 2, 9};
        bonAppetit(arr,1,12);
        bonAppetit(arr,1,7);
    }
}
