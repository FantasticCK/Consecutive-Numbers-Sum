package com.CK;

public class Main {

    public static void main(String[] args) {
        new Solution().consecutiveNumbersSum(3);
    }
}

class Solution {
    public int consecutiveNumbersSum(int N) {
        int res = 0;
        for (int i = 1; i * (i + 1) / 2 <= N; i++) {
            if (i % 2 == 1) {
                double mid = (double) N / (double) i;
                if (isInt(mid) && mid - (double) i / 2 > 0) {
                    res++;
                }
            } else {
                double mid = (double) N / (double) i;
                if (isPointFive(mid) && Math.ceil(mid) - (double) i / 2 > 0) {
                    res++;
                }
            }
        }
        return res;
    }

    public boolean isInt(double num) {
        return Math.floor(num) == num;
    }

    public boolean isPointFive(double num) {
        return num - Math.floor(num) == 0.5;
    }
}

//Math
class Solution {
    public int consecutiveNumbersSum(int N) {
        int ans = 0;
        for (int m = 1; ; m++) {
            int mx = N - m * (m-1) / 2;
            if (mx <= 0)
                break;
            if (mx % m == 0)
                ans++;
        }
        return ans;
    }
}