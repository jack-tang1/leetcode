package org.leetcode.leetcode.sword;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

public class FindRepeatNumber {
    public int findRepeatNumber0(int[] nums) {
        Map<Integer, AtomicInteger> map = new HashMap<>();
        for (int num : nums) {
            map.computeIfAbsent(num, k -> new AtomicInteger()).getAndIncrement();
            if (map.get(num).get() > 1) {
                return num;
            }
        }
        return 0;
    }

    public int findRepeatNumber1(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) {
                return num;
            } else {
                set.add(num);
            }
        }
        return 0;
    }

    public int findRepeatNumber2(int[] nums) {
        int[] arr = new int[nums.length];
        for (int num : nums) {
            arr[num]++;
            if (arr[num] > 1) {
                return num;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        FindRepeatNumber repeatNumber = new FindRepeatNumber();
        System.out.println(repeatNumber.findRepeatNumber2(new int[]{6, 3, 1, 0, 2, 5, 3}));
    }
}
