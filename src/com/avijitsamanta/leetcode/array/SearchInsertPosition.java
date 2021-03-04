package com.avijitsamanta.leetcode.array;

/***
 * @author Avijit Samanta
 *
 * Question link
 * https://leetcode.com/problems/search-insert-position/
 */

public class SearchInsertPosition {
    private static int searchInsert(int[] a, int target) {
        for(int i=0;i<a.length;i++){
            if(target==a[i])return i;
            if(i>0&&a[i-1]<target&& target<a[i])return i;
            if(i==a.length-1&&a[i]<target)return i+1;
        }
        return 0;
    }
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 5, 6};
        System.out.println(searchInsert(a, 4));
        System.out.println(searchInsert(a, 8));
        System.out.println(searchInsert(a, 3));
    }
}
