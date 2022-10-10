package org.leetcode.leetcode.sword;

import java.util.ArrayList;
import java.util.List;

public class CQueue {
    List<Integer> queue;
    public CQueue() {
         this.queue = new ArrayList<>();
    }

    public void appendTail(int value) {
        this.queue.add(value);
    }

    public int deleteHead() {
        if (this.queue.size() != 0) {
            Integer head = this.queue.get(0);
            this.queue.remove(head);
            return head;
        }
        return -1;
    }
}
