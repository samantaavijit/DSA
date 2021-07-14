package com.avijitsamanta.hackerrank.array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @author Avijit Samanta
 * <p>
 * Question link
 * https://www.hackerrank.com/challenges/minimum-distances/problem
 */
public class MinimumDistances {
    public static int minimumDistances(List<Integer> a) {
        int min = Integer.MAX_VALUE;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < a.size(); i++) {
            if (map.containsKey(a.get(i))) {
                min = Math.min(min, (i - map.get(a.get(i))));
            } else map.put(a.get(i), i);
        }
        if (map.size() == a.size()) return -1;
        return min;
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(7);
        list.add(1);
        list.add(3);
        list.add(4);
        list.add(1);
        list.add(7);
        System.out.println(minimumDistances(list));
    }
}
