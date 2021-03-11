package com.avijitsamanta.hackerrank.array;

/**
 * @author Avijit Samanta
 * <p>
 * Question link
 * https://www.hackerrank.com/challenges/designer-pdf-viewer/problem
 */
public class DesignerPDFViewer {
    private static int designerPdfViewer(int[] h, String word) {
        int height = -1;
        for (char c : word.toCharArray())
            height = Math.max(height, h[c - 65 - 32]);
        return height * word.length();
    }

    public static void main(String[] args) {
        int[] h = {1, 3, 1, 3, 1, 4, 1, 3, 2, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 7};
        System.out.println(designerPdfViewer(h, "zaba"));
    }
}
