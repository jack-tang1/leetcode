package org.leetcode.leetcode.sword;

import org.leetcode.leetcode.entity.ListNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RevertPrint {
    public int[] reversePrint0(ListNode head) {
        List<Integer> list = new ArrayList<>();
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(list.size() - 1 - i);
        }
        return result;
    }

    public int[] reversePrint1(ListNode head) {
        ListNode node = head;
        int count = 0;
        while (node != null) {
            count++;
            node = node.next;
        }
        int[] result = new int[count];
        for (int i = count - 1; i >= 0; i--) {
            result[i] = head.val;
            head = head.next;
        }
        Arrays.sort(result);
        return result;
    }
}
