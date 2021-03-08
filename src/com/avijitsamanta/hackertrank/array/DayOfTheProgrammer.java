package com.avijitsamanta.hackertrank.array;

/**
 * @author Avijit Samanta
 * <p>
 * Question link
 * https://www.hackerrank.com/challenges/day-of-the-programmer/problem
 */
public class DayOfTheProgrammer {

    private static String dayOfProgrammer(int year) {
        String date = ".09." + year;
        if (year == 1918) {
            return "26" + date;
        }
        if ((year <= 1917 && year % 4 == 0) || ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0))
            return "12" + date;
        else
            return "13" + date;
    }

    public static void main(String[] args) {
        System.out.println(dayOfProgrammer(1918));
        System.out.println(dayOfProgrammer(2021));
    }
}
