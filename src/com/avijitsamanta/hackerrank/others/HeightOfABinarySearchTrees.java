package com.avijitsamanta.hackerrank.others;

/**
 * @author Avijit Samanta
 * <p>
 * Question Link
 * https://www.hackerrank.com/challenges/30-binary-search-trees/problem
 */
public class HeightOfABinarySearchTrees {

    static class Node {
        Node left, right;
        int data;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    private static Node insert(Node root, int data) {
        if (root == null) {
            return new Node(data);
        } else {
            Node cur;
            if (data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }

    private static int getHeight(Node root) {
        if (root == null) return -1;
        return 1 + Math.max(getHeight(root.left), getHeight(root.right));
    }

    public static void main(String[] args) {
        Node root;
        root = insert(null, 3);
        root = insert(root, 5);
        root = insert(root, 6);
        root = insert(root, 10);
        root = insert(root, 11);
        root = insert(root, 12);
        root = insert(root, 7);
        root = insert(root, 4);
        root = insert(root, 1);
        root = insert(root, 0);
        root = insert(root, -10);
        System.out.println(getHeight(root));
    }
}
