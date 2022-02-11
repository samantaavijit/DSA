package com.avijitsamanta;

import java.util.Scanner;

public class AAA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of jumbled character array");
        int n = sc.nextInt();
        char[] arr = new char[n];
        System.out.println("Enter " + n + " characters");
        for (int i = 0; i < n; i++)
            arr[i] = sc.next().charAt(0);
        System.out.println("Enter secret code");
        String code = sc.next();
        for (char pos : code.toCharArray()) {
            System.out.print(arr[Integer.parseInt(pos + "")]);
        }
    }
}
