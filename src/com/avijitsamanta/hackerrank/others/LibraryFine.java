package com.avijitsamanta.hackerrank.others;

/**
 * @author Avijit Samanta
 * <p>
 * Question link
 * https://www.hackerrank.com/challenges/library-fine/problem
 */
public class LibraryFine {
    public static int libraryFine(int d1, int m1, int y1, int d2, int m2, int y2) {
        int day = d1 - d2;
        int month = m1 - m2;
        int year = y1 - y2;

        if (year < 0) return 0;
        if (year == 0 && month < 0) return 0;
        if (year == 0 ) {
            if (month==0){
                if (day < 0) return 0;
                return day * 15;
            }
            return 500*month;
        }
        return 10000;
    }

    public static void main(String[] args) {
        System.out.println(libraryFine(9, 6, 2015, 6, 6, 2015));
        System.out.println(libraryFine(14, 6, 2018, 5, 7, 2018));
        System.out.println(libraryFine(6, 6, 2015, 9, 6, 2016));
        System.out.println(libraryFine(2, 7, 1014, 1, 1, 1015));
        System.out.println(libraryFine(2, 6, 2014, 5, 7, 2014));
        System.out.println(libraryFine(28, 5, 2015, 15, 4, 2015));
        System.out.println(libraryFine(15, 7, 2014, 1, 7, 2014));
    }
}
