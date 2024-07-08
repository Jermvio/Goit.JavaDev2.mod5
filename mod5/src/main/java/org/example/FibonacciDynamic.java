package org.example;

import java.util.HashMap;

/**
 * Часова складність O(2k+k)
 * Просторова O(2k+k+memo)
 * k = n - memo.length (amount of numbers cached)
 */
public class FibonacciDynamic {
    private static HashMap<Integer, Long> memo = new HashMap<>();

    public static long fibonacci(int n) {
        if (n <= 1) {
            return n;
        }

        if (memo.containsKey(n)) {
            return memo.get(n);
        }

        long fib = fibonacci(n - 1) + fibonacci(n - 2);
        memo.put(n, fib);
        return fib;
    }
}

