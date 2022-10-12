package org.leetcode.leetcode.sword;

public class NumWays {
    public int numWays0(int n) {
        int MOD= 1000000007;
        if (n < 2) {
            return 1;
        }
        int p, q = 1; int r = 2;
        for (int i = 3; i <= n; i++) {
            p = q;
            q = r;
            r = (p + q) % MOD;
        }
        return r;
    }

    public int numWays1(int n) {
        int a = 1, b = 1, sum;
        for(int i = 0; i < n; i++){
            sum = (a + b) % 1000000007;
            a = b;
            b = sum;
        }
        return a;
    }

    public static void main(String[] args) {
        NumWays numWays = new NumWays();
        System.out.println(numWays.numWays1(3));
    }
}
