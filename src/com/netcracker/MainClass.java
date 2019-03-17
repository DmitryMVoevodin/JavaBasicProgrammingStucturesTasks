package com.netcracker;

import com.netcracker.MyTasks.*;

public class MainClass {

    public static void main(String[] args) {

        //********************Task 1********************
        System.out.println("\n\n*************************************Task 1*************************************");
        MyArray x1 = new MyArray(10);
        MyArray x2 = new MyArray(x1);
        MyArray x3 = new MyArray(x1);
        System.out.print("x1: "); x1.showArray();
        System.out.print("x2: "); x2.showArray();
        System.out.print("x3: "); x3.showArray();
        System.out.println();
        x1.bubbleSort(true); System.out.print("x1.bubbleSort(true): "); x1.showArray();
        x2.selectSort(true); System.out.print("x2.selectSort(true): "); x2.showArray();
        x3.sortFromArrays(true); System.out.print("x1.sortFromArrays(true): "); x3.showArray();
        x1.bubbleSort(false); System.out.print("x1.bubbleSort(false): "); x1.showArray();
        x2.selectSort(false); System.out.print("x2.selectSort(false): "); x2.showArray();
        x3.sortFromArrays(false); System.out.print("x1.sortFromArrays(false): "); x3.showArray();
        System.out.println();
        MyArray x4 = new MyArray(x1);
        System.out.print("x4: "); x4.showArray();
        x4.printTimeSort(true);
        x4.printTimeSort(false);
        //**********************************************

        //********************Task 2********************
        System.out.println("\n\n*************************************Task 2*************************************");
        System.out.println("Factorial");
        for(int i = 0; i < 21; ++i) {
            System.out.print("n = " + i +
                    "; cycle = " +  Factorial.factorialCycle(i) +
                    "; recursion = " + Factorial.factorialRecursion(i) + "; ");
            Factorial.factorialTime(i);
        }
        //**********************************************

        //********************Task 3********************
        System.out.println("\n\n*************************************Task 3*************************************");
        Cycles.method1(5); System.out.println();
        Cycles.method2A(8); System.out.println();
        Cycles.method2B(8); System.out.println();
        Cycles.method2C(8); System.out.println();
        Cycles.method2D(8); System.out.println();
        Cycles.method2E(7); System.out.println();
        Cycles.method2F(7); System.out.println();
        Cycles.method2G(7); System.out.println();
        Cycles.method2H(7); System.out.println();
        Cycles.method2I(7); System.out.println();
        //**********************************************

        //********************Task 4********************
        System.out.println("\n\n*************************************Task 4*************************************");
        System.out.println("a)"); OneDimensionalArray.methodA();
        System.out.println("b)"); OneDimensionalArray.methodB();
        System.out.println("c)"); OneDimensionalArray.methodC();
        System.out.println("d)"); OneDimensionalArray.methodD();
        System.out.println("e)"); OneDimensionalArray.methodE();
        System.out.println("f)"); OneDimensionalArray.methodF();
        System.out.println("\n\n");
        //**********************************************

        //********************Task 5********************
        System.out.println("\n\n*************************************Task 5*************************************");
        System.out.println("a)"); TwoDimensionalArray.methodA();
        System.out.println("b)"); TwoDimensionalArray.methodB();
        System.out.println("c)"); TwoDimensionalArray.methodC();
        System.out.println("d)"); TwoDimensionalArray.methodD();
        //**********************************************

        //********************Task 6********************
        System.out.println("\n\n*************************************Task 6*************************************");
        ElseIfSwitchCase.compareTimeEnum();
        System.out.println("\n\n");
        ElseIfSwitchCase.compareTimeArray();
        //**********************************************

    }

}
