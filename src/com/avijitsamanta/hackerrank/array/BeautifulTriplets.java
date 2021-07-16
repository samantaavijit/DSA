package com.avijitsamanta.hackerrank.array;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Avijit Samanta
 * Question link
 * https://www.hackerrank.com/challenges/beautiful-triplets/problem
 */
public class BeautifulTriplets {
    private static boolean isBeautiful(int i, int j, int k, int d) {
        int a = j - i;
        int b = k - j;
        return (a == b && b == d);
    }

    public static int beautifulTriplets(int d, List<Integer> arr) {
        int c = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                for (int k = j + 1; k < arr.size(); k++) {
                    if (isBeautiful(arr.get(i), arr.get(j), arr.get(k), d)) c++;
                }
            }
        }
        return c;
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(4);
        list.add(5);
        list.add(7);
        list.add(8);
        list.add(10);
        System.out.println(beautifulTriplets(3, list));
    }
}
