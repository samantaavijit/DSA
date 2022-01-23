package com.avijitsamanta.hackerrank.others;

/**
 * @author Avijit Samanta
 * <p>
 * Question link
 * https://www.hackerrank.com/challenges/drawing-book/problem
 */
public class DrawingBook {
    public static int pageCount(int n, int p) {
//        int c = 0, i = 1;
//        int back = n - p;
//        int font = p - 1;
//        if (font <= back) {    // turn from font
//            while (i < n) {
//                if (p >= i - 1 && p <= i) return c;
//                i += 2;
//                c++;
//            }
//        } else {
//            if (back == 0) return 0;
//            i = n;
//            if ((n & 1) == 0) { // even number
//                i = n - 1;
//                c++;
//            }
//            while (i >= 0) {
//                if (p >= i - 1 && p <= i) return c;
//                i -= 2;
//                c++;
//            }
//        }
        int i=1,j=n;
        while (i<=j){
            if (i==p)
            i++;
            j--;
        }

        return 0;
    }

    public static void main(String[] args) {
        System.out.println(pageCount(5, 3));
        System.out.println(pageCount(10, 8));
        System.out.println(pageCount(8, 8));
        System.out.println(pageCount(7,6));
    }
}
