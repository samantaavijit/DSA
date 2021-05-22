package com.avijitsamanta.hackerrank.string;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Avijit Samanta
 * <p>
 * Question link
 * https://www.hackerrank.com/challenges/30-queues-stacks/problem
 */

public class QueuesAndStacks {

    private final List<Character> queue = new ArrayList<>();
    private final List<Character> stack = new ArrayList<>();

    public static void main(String[] args) {
        String input = "racecar";
        char[] s = input.toCharArray();
        QueuesAndStacks p = new QueuesAndStacks();

        // Enqueue/Push all chars to their respective data structures:
        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }

        // Pop/Dequeue the chars at the head of both data structures and compare them:
        boolean isPalindrome = true;
        for (int i = 0; i < s.length / 2; i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;
                break;
            }
        }

        //Finally, print whether string s is palindrome or not.
        System.out.println("The word, " + input + ", is "
                + ((!isPalindrome) ? "not a palindrome." : "a palindrome."));
    }

    private char dequeueCharacter() {
        char c = queue.get(0);
        queue.remove(0);
        return c;
    }

    private char popCharacter() {
        char c = stack.get(stack.size() - 1);
        stack.remove(stack.size() - 1);
        return c;
    }

    private void enqueueCharacter(char c) {
        queue.add(c);
    }

    private void pushCharacter(char c) {
        stack.add(c);
    }
}
