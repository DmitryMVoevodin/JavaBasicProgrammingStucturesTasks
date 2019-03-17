package com.netcracker.MyTasks;

public class TwoDimensionalArray {

    public static int[][] createRandomArray(int row, int col, int lowerBound, int upperBound) {
        int[][] x = new int[row][];
        for(int i = 0; i < row; ++i) {
            x[i] = OneDimensionalArray.createRandomArray(col, lowerBound, upperBound);
        }
        return x;
    }

    public static void printArray(int[][] x) {
        for(int i = 0; i < x.length; ++i) {
            for(int j = 0; j < x[0].length; ++j){
                System.out.print(x[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void methodA() {
        int[][] x = createRandomArray(8, 8, 1, 99);
        printArray(x);
        int sumMainDiagonal = 0, sumSecondaryDiagonal = 0;
        long comMainDiagonal = 1, comSecondaryDiagonal = 1;
        for(int i = 0; i < x.length; ++i) {
            for(int j = 0; j < x[0].length; ++j){
                if(i == j) {
                    sumMainDiagonal += x[i][j];
                    comMainDiagonal *= x[i][j];
                }
                if(i == x[0].length - 1 - j) {
                    sumSecondaryDiagonal += x[i][j];
                    comSecondaryDiagonal *= x[i][j];
                }
            }
        }
        System.out.println("sumMainDiagonal = " + sumMainDiagonal +
                ", comMainDiagonal = " + comMainDiagonal +
                ", sumSecondaryDiagonal = " + sumSecondaryDiagonal +
                ", comSecondaryDiagonal = " + comSecondaryDiagonal);
    }

    public static void methodB(){
        int[][] x = createRandomArray(8, 5, -99, 99);
        printArray(x);
        int max = x[0][0], imax = 0, jmax = 0;
        for(int i = 0; i < x.length; ++i) {
            for(int j = 0; j < x[0].length; ++j){
                if(max < x[i][j]) {
                    max = x[i][j];
                    imax = i;
                    jmax = j;
                }
            }
        }
        System.out.println("max[" + imax + "][" + jmax + "] = " + max);
    }

    public static void methodC(){
        int[][] x = createRandomArray(8, 5, -10, 10);
        printArray(x);
        int maxP = 0, imaxP = 0;
        int p;
        for(int i = 0; i < x.length; ++i) {
            p = 1;
            for(int j = 0; j < x[0].length; ++j) {
                p *= x[i][j];
            }
            if(maxP < Math.abs(p)) {
                maxP = Math.abs(p);
                imaxP = i;
            }
        }
        System.out.println("maxP[" + imaxP + "] = " + maxP);
    }

    public static void methodD(){
        int[][] x = createRandomArray(10, 7, 0, 100);
        printArray(x);
        for(int i = 0; i < x.length; ++i) {
            selectSort(x[i], false);
        }
        System.out.println();
        printArray(x);
    }

    private static void selectSort(int[]x, boolean isAscending) {
        int length = x.length, tmp;
        boolean b;
        int extremumIndex;
        for(int i = 0; i < length - 1; ++i) {
            extremumIndex = i;
            for(int j = (i + 1); j < length; ++j) {
                b = isAscending ? (x[j] < x[extremumIndex]) : (x[j] > x[extremumIndex]);
                if(b) {
                    extremumIndex = j;
                }
            }
            tmp = x[i];
            x[i] = x[extremumIndex];
            x[extremumIndex] = tmp;
        }
    }

}