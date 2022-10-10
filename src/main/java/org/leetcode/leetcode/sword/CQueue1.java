package org.leetcode.leetcode.sword;

import java.util.ArrayDeque;
import java.util.Deque;

public class CQueue1 {
    Deque<Integer> inStack;
    Deque<Integer> outStack;

    public CQueue1() {
        inStack = new ArrayDeque<>();
        outStack = new ArrayDeque<>();
    }

    public void appendTail(int value) {
        inStack.push(value);
    }

    public int deleteHead() {
        if (outStack.isEmpty()) {
            if (inStack.isEmpty()) {
                return -1;
            }
            while (!inStack.isEmpty()) {
                outStack.push(inStack.pop());
            }
        }
        return outStack.pop();
    }
}
