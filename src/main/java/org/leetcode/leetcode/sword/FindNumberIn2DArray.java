package org.leetcode.leetcode.sword;

public class FindNumberIn2DArray {
    public boolean findNumberIn2DArray0(int[][] matrix, int target) {
        for (int[] ints : matrix) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (ints[j] == target) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean findNumberIn2DArray1(int[][] matrix, int target) {
        for (int[] row : matrix) {
            boolean flag = search(row, target);
            if (flag) {
                return true;
            }
        }
        return false;
    }

    public boolean search(int[] nums, int target) {
        int low = 0, high = nums.length - 1;
        while (low <= high) {
            int mid = (high - low) / 2 + low;
            int num = nums[mid];
            if (num == target) {
                return true;
            } else if (num > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return false;
    }

    public boolean findNumberIn2DArray2(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0) {
            return false;
        }
        int m = matrix.length, n = matrix[0].length;
        int row = 0, col = n - 1;
        while (row < m && col >= 0) {
            if (matrix[row][col] > target) {
                col--;
            } else if (matrix[row][col] < target) {
                row++;
            } else {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = new int[][]{new int[]{1, 4, 7, 11, 15},
                new int[]{2, 5, 8, 12, 19},
                new int[]{3, 6, 9, 16, 22},
                new int[]{10, 13, 14, 17, 24},
                new int[]{18, 21, 23, 26, 30}};
        FindNumberIn2DArray findNumberIn2DArray = new FindNumberIn2DArray();
        System.out.println(findNumberIn2DArray.findNumberIn2DArray1(matrix, 26));
    }
}
