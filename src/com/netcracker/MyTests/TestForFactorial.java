package com.netcracker.MyTests;

import com.netcracker.MyTasks.Factorial;

public class TestForFactorial {

    public static void main(String[] args) {
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
    }

}
