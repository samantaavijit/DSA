package com.avijitsamanta.gfg.string;

/**
 * @author Avijit Samanta
 * Question link
 * https://practice.geeksforgeeks.org/problems/remove-leading-zeros-from-an-ip-address3530/1
 */
public class RemoveLeadingZerosFromAnIPAddress {
    private static String newIPAdd(String S) {
        StringBuilder ans = new StringBuilder("");
        for (String value : S.split("\\.")) {
            int j = 0;
            while (j < value.length() && value.charAt(j) == '0') j++;
            if (j == value.length()) ans.append("0");
            else ans.append(value.substring(j));
            ans.append(".");
        }
        return ans.substring(0, ans.length() - 1);
    }

    public static void main(String[] args) {
        System.out.println(newIPAdd("100.020.003.400"));
        System.out.println(newIPAdd("100.000.010.0999"));
    }
}
