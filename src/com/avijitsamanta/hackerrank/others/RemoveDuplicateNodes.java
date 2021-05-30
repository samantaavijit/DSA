package com.avijitsamanta.hackerrank.others;

/***
 * @author Avijit Samanta
 *
 * Question link
 * https://www.hackerrank.com/challenges/30-linked-list-deletion/problem
 */
public class RemoveDuplicateNodes {
    private static Node insert(Node head, int data) {
        Node p = new Node(data);
        if (head == null)
            head = p;
        else if (head.next == null)
            head.next = p;
        else {
            Node start = head;
            while (start.next != null)
                start = start.next;
            start.next = p;
        }
        return head;
    }

    public static void display(Node head) {
        Node start = head;
        while (start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
        System.out.println();
    }

    public static Node removeDuplicates(Node head) {
        Node start = head;
        if (head == null) return null;
        while (start.next != null) {
            if (start.data == start.next.data) {
                start.next = start.next.next;
            } else start = start.next;
        }
        return head;
    }

    public static void main(String[] args) {
        Node head;
        head = insert(null, 1);
        head = insert(head, 2);
        head = insert(head, 2);
        head = insert(head, 3);
        head = insert(head, 3);
        head = insert(head, 4);
        display(head);
        head=removeDuplicates(head);
        display(head);
    }
}
