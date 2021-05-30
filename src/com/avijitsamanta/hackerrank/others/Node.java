package com.avijitsamanta.hackerrank.others;

public class Node {
    Node left, right, next;
    int data;

    Node(int data) {
        this.data = data;
        left = right = next = null;
    }
}
