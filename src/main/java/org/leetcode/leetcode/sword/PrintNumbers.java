package org.leetcode.leetcode.sword;

import java.util.Arrays;

public class PrintNumbers {
    public int[] printNumbers0(int n) {
        int pow = (int) Math.pow(10, n) - 1;
        int[] result = new int[pow];
        for (int i = 0; i < pow; i++) {
            result[i] = i + 1;
        }
        return result;
    }

    public static void main(String[] args) {
        PrintNumbers printNumbers = new PrintNumbers();
        System.out.println(Arrays.toString(printNumbers.printNumbers0(2)));
    }
}
