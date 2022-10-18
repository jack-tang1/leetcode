package org.leetcode.leetcode.sword;

public class HammingWeight {
    public int hammingWeight(int n) {
        int count = 0;
        while (n != 0) {
            count++;
            n = n & (n - 1);
        }
        return count;
    }

    public int hammingWeight0(int n) {
        int ret = 0;
        for (int i = 0; i < 32; i++) {
            if ((n & (1<<i)) != 0) {
                ret++;
            }
        }
        return ret;
    }

    public static void main(String[] args) {
        HammingWeight weight = new HammingWeight();
        System.out.println(weight.hammingWeight0(7));
    }
}
