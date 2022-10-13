package org.leetcode.leetcode.sword;

public class MinArray {
    public int minArray0(int[] numbers) {
        int n = numbers.length;
        for (int i = n - 1; i > 0; i--) {
            if (numbers[i] < numbers[i - 1]) {
                return numbers[i];
            }
        }
        return numbers[0];
    }

    public int minArray1(int[] numbers) {
        int low = 0;
        int high = numbers.length - 1;
        while (low < high) {
            int pivot = low + (high - low) / 2;
            if (numbers[pivot] < numbers[high]) {
                high = pivot;
            } else if (numbers[pivot] > numbers[high]) {
                low = pivot + 1;
            } else {
                high -= 1;
            }
        }
        return numbers[low];
    }

    public static void main(String[] args) {
        int[] numbers = new int[]{2, 2, 2, 0, 1};
        MinArray minArray = new MinArray();
        System.out.println(minArray.minArray1(numbers));
    }
}
