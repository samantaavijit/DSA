package com.avijitsamanta.hackerrank.array;

import java.util.ArrayList;
import java.util.List;

/***
 * @author Avijit Samanta
 *
 * Question link
 * https://www.hackerrank.com/challenges/30-sorting/problem
 */
public class Sorting {
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        a.add(3);
        a.add(2);
        a.add(1);
        int count = 0;
        for (int i = 0; i < a.size(); i++) {
            int numberOfSwap = 0;
            for (int j = 0; j < a.size() - i - 1; j++) {
                if (a.get(j) > a.get(j + 1)) {
                    int temp = a.get(j);
                    a.set(j, a.get(j + 1));
                    a.set(j + 1, temp);
                    numberOfSwap++;
                }
            }
            if (numberOfSwap == 0) break;
            count += numberOfSwap;
        }

        System.out.println("Array is sorted in " + count + " swaps.\nFirst Element: " + a.get(0) + "\nLast Element: " + a.get(a.size() - 1));

    }
}
