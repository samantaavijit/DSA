package com.avijitsamanta.gfg.array;


import java.util.ArrayList;

/***
 * @author Avijit Samanta
 *
 * Question link
 * https://practice.geeksforgeeks.org/problems/n-queen-problem0315/1
 */
public class NQueen {
    private static final ArrayList<ArrayList<Integer>> result = new ArrayList<>();

    private static ArrayList<Integer> addPlace(int[][] arr) {
        int c;
        ArrayList<Integer> results = new ArrayList<>();
        for (int[] row : arr) {
            c = 0;
            for (int col : row) {
                c++;
                if (col == 1) results.add(c);
            }
        }
        return results;
    }

    private static boolean nQueen(int[][] arr, int column) {
//        if (column >= arr.length) return true; // single solution

        if (column >= arr.length) { // multiple solutions
            display(arr);
            result.add(addPlace(arr));
        }

        for (int i = 0; i < arr.length; i++) {
            if (isSafe(arr, i, column)) {
                arr[i][column] = 1;
                if (nQueen(arr, column + 1)) return true;
                arr[i][column] = 0;
            }
        }
        return false;
    }

    private static boolean isSafe(int[][] arr, int row, int column) {
        int i, j;

        /* Check this row on left side */
        for (i = 0; i < column; i++)
            if (arr[row][i] == 1)
                return false;

        /* Check upper diagonal on left side */
        for (i = row, j = column; i >= 0 && j >= 0; i--, j--)
            if (arr[i][j] == 1)
                return false;

        /* Check lower diagonal on left side */
        for (i = row, j = column; j >= 0 && i < arr.length; i++, j--)
            if (arr[i][j] == 1)
                return false;

        return true;
    }

    private static void display(int[][] arr) {
        for (int[] row : arr) {
            for (int col : row)
                System.out.print(col + " ");
            System.out.println();
        }
        System.out.println("-------------------------------------");
    }

    public static void main(String[] args) {
        int N = 8;
        int[][] arr = new int[N][N];
        display(arr);
        if (nQueen(arr, 0)) {
            System.out.println("Solution is");
            display(arr);
        }

        System.out.println(result);

    }
}
