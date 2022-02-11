package com.avijitsamanta;

public class BubbleSort {
    private static void bubbleSort(int[] array) {
        int temp;
        for (int i = 0; i < array.length - 1; i++) {
            System.out.println("Step " + (i + 1));
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
                displayArray(array);
            }
        }
    }

    private static void displayArray(int[] array) {
        for (int val : array) System.out.print(val + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {4, 2, -1};
        displayArray(arr);
        bubbleSort(arr);
    }
}
