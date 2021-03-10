package com.avijitsamanta.hackertrank.array;

/**
 * @author Avijit Samanta
 * <p>
 * Question link
 * https://www.hackerrank.com/challenges/cats-and-a-mouse/problem
 */
public class CatsAndAMouse {
    private static String catAndMouse(int x, int y, int z) {
        x = Math.abs(x - z);
        y = Math.abs(y - z);
        return x == y ? "Mouse C" : x < y ? "Cat A" : "Cat B";
    }

    public static void main(String[] args) {
        System.out.println(catAndMouse(1, 2, 3));
        System.out.println(catAndMouse(1, 3, 2));
    }
}
