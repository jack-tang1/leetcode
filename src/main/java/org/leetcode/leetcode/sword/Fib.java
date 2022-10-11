package org.leetcode.leetcode.sword;

public class Fib {
    /**
     * 时间复杂度过高，failed
     */
    public int fib0(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fib0(n - 1) + fib0(n - 2);
        }
    }

    public int fib1(int n) {
        final int MOD = 1000000007; // 为1e9+7,大于某个数时，累加结果就会大于 Integer.MAX_VALUE ,大于后就是负数了，影响计算结果
        if (n < 2) {
            return n;
        }
        int p, q = 0, r = 1;
        for (int i = 2; i <= n; ++i) {
            p = q;
            q = r;
            r = (p + q) % MOD;
        }
        return r;
    }

    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE);
        Fib fib = new Fib();
        System.out.println(fib.fib1(44));
    }
}
