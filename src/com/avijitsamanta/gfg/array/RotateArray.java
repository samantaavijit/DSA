package com.avijitsamanta.gfg.array;

/**
 * @author Avijit Samanta
 * <p>
 * Question link
 * https://practice.geeksforgeeks.org/problems/rotate-array-by-n-elements/0/?category[]=Arrays&category[]=Arrays&page=1&query=category[]Arrayspage1category[]Arrays
 */
public class RotateArray {
    private static void rotate1(int[] arr, int item) {
        int temp;
        while (item-- > 0) {
            temp = arr[0];
            for (int i = 1; i < arr.length; i++)
                arr[i - 1] = arr[i];
            arr[arr.length - 1] = temp;
        }
    }

    private static void rotate2(int[] arr, int item) {
        reverse(arr, 0, item - 1);
        reverse(arr, item, arr.length - 1);
        reverse(arr, 0, arr.length - 1);
    }

    private static void reverse(int[] arr, int start, int end) {
        int temp;
        while (start < end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        for (int val : arr)
            System.out.print(val + " ");
        rotate2(arr, 2);
        System.out.println();
        for (int val : arr)
            System.out.print(val + " ");
    }
}
