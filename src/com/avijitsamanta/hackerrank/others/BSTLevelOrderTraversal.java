package com.avijitsamanta.hackerrank.others;

/***
 * @author Avijit Samanta
 *
 * Question link
 * https://www.hackerrank.com/challenges/30-binary-trees/problem
 */

public class BSTLevelOrderTraversal {
    private static Node insert(Node root, int data) {
        if (root == null)
            return new Node(data);
        if (data <= root.data)
            root.left = insert(root.left, data);
        else
            root.right = insert(root.right, data);

        return root;
    }

    private static void levelOrder(Node root) {

    }

    public static void main(String[] args) {
        Node root;
        root = insert(null, 3);
        root = insert(root, 5);
        root = insert(root, 2);
        root = insert(root, 1);
        root = insert(root, 4);
        root = insert(root, 7);
        levelOrder(root);

        
    }
}
