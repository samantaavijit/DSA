package com.avijitsamanta;

public class BinarySearch {
    private static int binarySearch(int[] arr, int start, int end, int element) {
        int mid;
        while (start <= end) {
            mid = (start + end) / 2;
            if (arr[mid] == element) return mid;
            if (arr[mid] > element) end = mid - 1;
            else start = mid + 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {5, 6, 8, 11, 13, 25, 27, 30, 45, 99};
        System.out.println(binarySearch(arr, 0, arr.length - 1, 99));
    }
}
