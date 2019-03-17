package com.netcracker.MyTests;

import com.netcracker.MyTasks.MyArray;

public class TestForMyArray {

    public static void main(String[] args) {
        //********************Task 1********************
        System.out.println("\n\n*************************************Task 1*************************************");
        MyArray x1 = new MyArray(10);
        MyArray x2 = new MyArray(x1);
        MyArray x3 = new MyArray(x1);
        MyArray x4 = new MyArray(x1);
        System.out.print("x1: "); x1.showArray();
        System.out.print("x2: "); x2.showArray();
        System.out.print("x3: "); x3.showArray();
        System.out.print("x3: "); x4.showArray();
        System.out.println();
        x1.bubbleSort(true); System.out.print("x1.bubbleSort(true): "); x1.showArray();
        x2.selectSort(true); System.out.print("x2.selectSort(true): "); x2.showArray();
        x3.sortFromArrays(true); System.out.print("x3.sortFromArrays(true): "); x3.showArray();
        x4.mergeSort(true, 0, x4.getLength() - 1); System.out.print("x4.mergeSort(true, 0, x4.getLength() - 1): "); x4.showArray();
        x1.bubbleSort(false); System.out.print("x1.bubbleSort(false): "); x1.showArray();
        x2.selectSort(false); System.out.print("x2.selectSort(false): "); x2.showArray();
        x3.sortFromArrays(false); System.out.print("x3.sortFromArrays(false): "); x3.showArray();
        x4.mergeSort(false, 0, x4.getLength() - 1); System.out.print("x4.mergeSort(false, 0, x4.getLength() - 1): "); x4.showArray();
        System.out.println();
        MyArray x5 = new MyArray(x1);
        System.out.print("x5: "); x5.showArray();
        x5.printTimeSort(true);
        System.out.println();
        x5.printTimeSort(false);
        //**********************************************
    }

}
