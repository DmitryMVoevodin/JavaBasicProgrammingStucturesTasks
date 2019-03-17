package com.netcracker.MyTasks;

public class Factorial {

    public static long factorialCycle(int n) {
        long result = 1;
        for(int i = 1; i <= n; ++i) {
            result *= i;
        }
        return result;
    }

    public static long factorialRecursion(int n) {
        if(n == 0) return 1;
        return (n * factorialRecursion(n - 1));
    }

    public static void factorialTime(int n) {
        long startTime, estimatedTime;
        startTime = System.nanoTime();
        factorialCycle(n);
        estimatedTime = System.nanoTime() - startTime;
        System.out.print("cycleTime(" + n + ") = " + estimatedTime);
        startTime = System.nanoTime();
        factorialRecursion(n);
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("; recursionTime(" + n + ") = "  + estimatedTime);
    }

}
