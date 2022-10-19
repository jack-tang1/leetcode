package org.leetcode.leetcode.sword;

public class MyPow {
    public double myPow(double x, int n) {
        double ret = 1;
        if (n > 0) {
            for (int i = 0; i < n; i++) {
                ret *= x;
            }
        } else if (n < 0) {
            for (int i = 0; i < -n; i++) {
                ret *= x;
            }
            ret = 1 / ret;
        }
        return ret;
    }

    public double myPow1(double x, int n) {
        return (long) n >= 0 ? quickMul(x, n) : 1.0 / quickMul(x, -(long) n);
    }

    public double quickMul(double x, long N) {
        if (N == 0) {
            return 1.0;
        }
        double y = quickMul(x, N / 2);
        return N % 2 == 0 ? y * y : y * y * x;
    }

    public static void main(String[] args) {
        MyPow myPow = new MyPow();
        System.out.println(myPow.myPow1(2.00000, 75));
    }
}
