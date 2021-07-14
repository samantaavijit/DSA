package com.avijitsamanta.gfg.bitmanipulation;

public class DetectOppositeSign {
    private static boolean isOppositeSign(int x, int y) {
        return ((x ^ y) < 0);
    }

    private static int addOne(int x) {
        return -(~x);
    }

    private static int subtractOne(int x) {
        return ((x << 1) + ~x);
    }

    private static int multiplyBy8(int x) {
        return x << 3;
    }

    private static int multiplyBy2(int x) {
        return x << 1;
    }

    private static int multiplyWith3Point5(int x) {
        return (x << 1) + x + (x >> 1);
    }

    /**
     * Input:  12 (00...01100)
     * Output: 8 (00...01000)
     *
     * @param x int number
     * @return https://www.geeksforgeeks.org/turn-off-the-rightmost-set-bit/
     */
    private static int turnOfRightMostBit(int x) {
        return x & (x - 1);
    }

    public static void main(String[] args) {
//        System.out.println(isOppositeSign(100, -100));
//        System.out.println(isOppositeSign(-100, 200));
//        System.out.println(addOne(10));
//        System.out.println(addOne(253));
//        System.out.println(multiplyBy8(2));
//        System.out.println(multiplyBy8(3));
//        System.out.println(multiplyBy2(2));
//        System.out.println(multiplyBy2(3));
//        System.out.println(multiplyWith3Point5(2));
//        System.out.println(multiplyWith3Point5(3));
        System.out.println(subtractOne(2));
        System.out.println(subtractOne(3));
    }
}
