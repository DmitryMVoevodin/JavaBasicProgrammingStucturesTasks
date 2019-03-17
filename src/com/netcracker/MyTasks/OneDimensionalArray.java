package com.netcracker.MyTasks;

import java.util.Random;

public class OneDimensionalArray {

    public static int[] createRandomArray(int length, int lowerBound, int upperBound) {
        int[] x = new int[length];
        Random rnd = new Random();
        for(int i = 0; i < length; ++i){
            x[i] = rnd.nextInt(-lowerBound+upperBound + 1) + lowerBound;
        }
        return x;
    }

    private static void printArray(int[] a, boolean order) {
        if(order) {
            for(int i = 0; i < a.length; ++i) {
                System.out.print(a[i] + " ");
            }
            System.out.println();
        } else {
            for(int i = a.length - 1; i >= 0; i--) {
                System.out.print(a[i] + " ");
            }
            System.out.println();
        }
    }

    public static void methodA() {
        int[] x = new int[50];
        int k = 1;
        for(int i = 0; i < 50; ++i){
            x[i] = k;
            k += 2;
        }
        printArray(x,true);
        printArray(x,false);
    }

    public static void methodB() {
        int[] x = createRandomArray(20, 0, 10);
        int even = 0, odd = 0;
        for(int i = 0; i < x.length; ++i){
            odd += x[i] % 2;
        }
        even = x.length - odd;
        printArray(x,true);
        System.out.println("even = " + even + ", odd = " + odd);
    }

    public static void methodC() {
        int[] x = createRandomArray(10, 1, 100);
        printArray(x, true);
        for(int i = 1; i < x.length; i += 2){
            x[i] = 0;
        }
        printArray(x, true);
    }

    public static void methodD() {
        int[] x = createRandomArray(15, -50, 50);
        printArray(x, true);
        int min = x[0], imin = 0;
        int max = x[0], imax = 0;
        for(int i = 0; i < x.length; ++i) {
            if(x[i] <= min) {
                min = x[i];
                imin = i;
            }
            if(x[i] >= max) {
                max = x[i];
                imax = i;
            }
        }
        System.out.println("min[imin = " + imin + "] = " + min);
        System.out.println("max[imax = " + imax + "] = " + max);
    }

    public static void methodE() {
        int[] x = createRandomArray(10, 0, 10);
        int[] y = createRandomArray(x.length, 0, 10);
        printArray(x, true);
        printArray(y, true);
        double xAver = 0, yAver = 0;
        for(int i = 0; i < x.length; ++i){
            xAver += x[i];
            yAver += y[i];
        }
        xAver /= x.length;
        yAver /= y.length;
        String s1 = new String("the first array (average = " + xAver + ")");
        String s2 = new String("the second array (average = " + yAver + ")");
        String s3 = (xAver > yAver) ? (new String(">")) :
                ((xAver < yAver) ? (new String("<")) :
                        (new String("=")));
        System.out.println(s1 + " " + s3 + " " + s2);
    }

    public static void methodF() {
        int lowerBound = -1, upperBound = 1;
        int[] x = createRandomArray(20, lowerBound, upperBound);
        printArray(x, true);
        int[] frequency = new int[upperBound - lowerBound + 1];
        for(int i = 0; i < frequency.length; ++i){
            frequency[i] = 0;
        }
        for(int i = 0; i < x.length; ++i){
            frequency[x[i] - lowerBound]++;
        }
        int max = frequency[0];
        for(int i = 0; i < frequency.length; ++i) {
            if(max < frequency[i]) {
                max = frequency[i];
            }
        }
        System.out.print("The most frequent elements are: ");
        for(int i = 0; i < frequency.length; ++i) {
            if(max == frequency[i]) {
                System.out.print((i + lowerBound) + "(" + frequency[i] +" times); ");
            }
        }
    }

}