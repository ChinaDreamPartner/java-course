package com;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution {
    static Map<Integer, int[]> memo;
    public static int[] beautifulArray(int N) {
        memo = new HashMap();
        return f(N);
    }

    public static int[] f(int N) {
        if (memo.containsKey(N))
            return memo.get(N);

        int[] ans = new int[N];
        if (N == 1) {
            ans[0] = 1;
        } else {
            int t = 0;
            for (int x: f((N+1)/2))  // odds
                ans[t++] = 2*x - 1;
            for (int x: f(N/2))  // evens
                ans[t++] = 2*x;
        }
        memo.put(N, ans);
        return ans;
    }

    public static void main(String[] args) {
        beautifulArray(5);
        System.out.println(memo);
    }
}


