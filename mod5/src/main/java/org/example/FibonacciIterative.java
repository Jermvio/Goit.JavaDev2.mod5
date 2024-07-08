package org.example;

/**
 * Часова складність O(n)
 * Просторова O(1)
 */
public class FibonacciIterative {
    public static long fibonacci(int n) {
        long[] sequence = {0,1};
        for(int i = 1; i <= n; i++) {
            sequence[i%2] += sequence[(i+1)%2];
        }
        return sequence[n%2];
    }
}
