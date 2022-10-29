package com.n3.algorithms_java.recursion_and_backtracking_02;

public class Examples {
    public static void main(String[] args) {

        System.out.println(fibonacci(10)); // 89
        System.out.println(fibonacci(0)); // 1

        System.out.println(recursiveFactorial(5));
        System.out.println(iterativeFactorial(5));

        System.out.println(fibonacci(50)); // This will hang!
    }

    static long fibonacci(int n) {
        if (n <= 1) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    static long recursiveFactorial(int n){
        if (n == 0) {
            return 1;
        }
        return n * recursiveFactorial(n - 1);
    }

    static long iterativeFactorial(int num) {
        long result = 1;
        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        return result;
    }



}
