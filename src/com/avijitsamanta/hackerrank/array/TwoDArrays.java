package com.avijitsamanta.hackerrank.array;

/**
 * @author Avijit Samanta
 * <p>
 * Question link
 * https://www.hackerrank.com/challenges/30-2d-arrays/problem
 */
public class TwoDArrays {
    private static int calculate(int[][] arr, int x0, int x1, int y0, int y1) {
        int sum = arr[y0 + 1][x0 + 1];
        while (x0 <= x1) {
            sum += arr[y0][x0];
            sum += arr[y1][x0];
            x0++;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[][] arr = {
                {1, 1, 1, 0, 0, 0},
                {0, 1, 0, 0, 0, 0},
                {1, 1, 1, 0, 0, 0},
                {0, 0, 2, 4, 4, 0},
                {0, 0, 0, 2, 0, 0},
                {0, 0, 1, 2, 4, 0}};

        int max=Integer.MIN_VALUE;
        for (int i=0;i<=3;i++){
            for (int j=0;j<=3;j++){
                max=Math.max(max,calculate(arr,j,j+2,i,i+2));
            }
        }
        System.out.println(max);

    }
}
