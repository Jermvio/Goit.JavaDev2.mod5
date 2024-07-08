package org.example;

/**
 * Часова складність O(2n+n)
 * Просторова O(2n+n)
 */
public class FibonacciRecursive {
    public static long fibonacci(int n) {
        if (n <= 1) {
            return n;
        }

        return fibonacci(n-1) + fibonacci(n-2);
    }
}

