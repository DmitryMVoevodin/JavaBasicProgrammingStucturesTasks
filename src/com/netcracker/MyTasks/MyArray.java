package com.netcracker.MyTasks;

import java.util.Arrays;
import java.util.Random;

public class MyArray {

    private static int DEFAULT_LENGTH = 10;

    private int length;
    private int[] x;

    public MyArray() {
        this(DEFAULT_LENGTH);
    }

    public MyArray(int length){
        this.length = length;
        x = new int[length];
        setRandomValues();
    }

    public MyArray(int[] x){
        setArray(x);
    }

    public MyArray(MyArray obj) {
        if(obj == null) {
            this.length = DEFAULT_LENGTH;
            x = new int[length];
            setRandomValues();
        } else {
            this.length = obj.length;
            this.x = new int[this.length];
            for(int i = 0; i < this.length; ++i){
                this.x[i] = obj.x[i];
            }
        }
    }

    public void setRandomValues(){
        Random rnd = new Random();
        for(int i = 0; i < length; ++i){
            x[i] = rnd.nextInt(100);
        }
    }

    public void setArray(int[] x) {
        this.length = x.length;
        this.x = new int[this.length];
        for(int i = 0; i < this.length; ++i) {
            this.x[i] = x[i];
        }
    }

    public int[] getArray(){
        int[] x = new int[this.length];
        for(int i = 0; i < this.length; ++i) {
            x[i] = this.x[i];
        }
        return x;
    }

    public int getLength() {
        return x.length;
    }

    public void setValue(int i, int value) {
        i = (i < 0 ? 0 : ((i > (length - 1)) ? (length - 1) : i));
        x[i] = value;
    }

    public int getValue(int i){
        i = (i < 0 ? 0 : ((i > (length - 1)) ? (length - 1) : i));
        return x[i];
    }

    public void showArray(){
        for(int v : x) {
            System.out.print(v + " ");
        }
        System.out.println();
    }

    public void multiply(int a) {
        for(int i = 0; i < length; ++i) {
            x[i] *= a;
        }
    }

    public void changePlaces(int i, int j) {
        i = (i < 0 ? 0 : ((i > (length - 1)) ? (length - 1) : i));
        j = (j < 0 ? 0 : ((j > (length - 1)) ? (length - 1) : j));
        int tmp = x[i];
        x[i] = x[j];
        x[j] = tmp;
    }

    public void bubbleSort(boolean isAscending) {
        boolean b;
        for(int i = length - 1; i > 0; --i) {
            for(int j = 0; j < i; ++j) {
                b = isAscending ? (x[j] > x[j + 1]) : (x[j] < x[j + 1]);
                if(b) {
                    changePlaces(j, j + 1);
                }
            }
        }
    }

    public void selectSort(boolean isAscending) {
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
            changePlaces(i, extremumIndex);
        }
    }

    public void sortFromArrays(boolean isAscending) {
        if(isAscending){
            Arrays.sort(x);
        } else {
            this.multiply(-1);
            Arrays.sort(x);
            this.multiply(-1);
        }
    }

    public void mergeSort(boolean isAscending, int begin, int end) {
        if(begin == end) return;
        else {
            int L = end - begin + 1;
            int middle = (begin + end) / 2;
            //Recursion
            mergeSort(isAscending, begin, middle);
            mergeSort(isAscending, middle + 1, end);
            //Merging
            int[] xtmp = new int[L];
            int i = 0;
            boolean b;
            int i1 = begin, i2 = middle + 1;
            while((i1 <= middle) && (i2 <= end)) {
                b = isAscending ? (x[i1] < x[i2]) : (x[i1] > x[i2]);
                xtmp[i++] = b ? x[i1++] : x[i2++];
            }
            while(i1 <= middle) xtmp[i++] = x[i1++];
            while(i2 <= end) xtmp[i++] = x[i2++];
            for(int j = 0; j < L; ++j) x[begin + j] = xtmp[j];
        }
    }

    public void printTimeSort(boolean isAscending) {
        MyArray obj1 = new MyArray(x);
        MyArray obj2 = new MyArray(x);
        MyArray obj3 = new MyArray(x);
        MyArray obj4 = new MyArray(x);
        long startTime, estimatedTime;
        startTime = System.nanoTime();
        obj1.bubbleSort(isAscending);
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("Time for bubbleSort(" + isAscending + "): " + estimatedTime);
        startTime = System.nanoTime();
        obj2.selectSort(isAscending);
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("Time for selectSort(" + isAscending + "): " + estimatedTime);
        startTime = System.nanoTime();
        obj3.sortFromArrays(isAscending);
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("Time for sortFromArrays(" + isAscending + "): " + estimatedTime);
        startTime = System.nanoTime();
        obj4.mergeSort(isAscending, 0, obj4.length - 1);
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("Time for mergeSort(" + isAscending + ", 0, length - 1): " + estimatedTime);
    }

}
