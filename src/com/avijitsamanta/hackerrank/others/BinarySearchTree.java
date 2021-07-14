package com.avijitsamanta.hackerrank.others;

public class BinarySearchTree {
    /***
     * insert note
     * @param root it is root of the node
     * @param data it is data of the node
     * @return return nothing
     */
    private static Node insert(Node root, int data) {
        if (root == null)
            return new Node(data);
        if (data <= root.data)
            root.left = insert(root.left, data);
        else
            root.right = insert(root.right, data);

        return root;
    }

    /**
     * PreOrder Traversal
     *
     * @param root it is root of the node
     */
    private static void preOrderTraversal(Node root) {
        if (root == null) return;
        System.out.print(root.data + " ");
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }

    /***
     * InOrder Traversal
     * @param root it is root of the node
     */
    private static void inOrderTraversal(Node root) {
        if (root == null) return;
        inOrderTraversal(root.left);
        System.out.print(root.data + " ");
        inOrderTraversal(root.right);
    }

    /**
     * PostOrder Traversal
     * @param root it is root of the node
     */
    private static void postOrderTraversal(Node root) {
        if (root == null) return;
        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.print(root.data + " ");
    }

    private static void levelOrderTraversal(Node root){
        // TODO implement this
    }

    public static void main(String[] args) {
        Node root;
        root = insert(null, 4);

        root = insert(root, 2);
        root = insert(root, 1);
        root = insert(root, 3);

        root = insert(root, 6);
        root = insert(root, 5);
        root = insert(root, 7);


        System.out.println("InOrder Traversal");
        inOrderTraversal(root);

        System.out.println("\nPostOrder Traversal");
        postOrderTraversal(root);

        System.out.println("\nPreOrder Traversal");
        preOrderTraversal(root);
    }
}
