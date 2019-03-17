package com.netcracker.MyTasks;

public class Cycles {

    public static void method1(int n){
        for(int row = 0; row < n; ++row) {
            for(int col = 0; col < n; ++col) {
                System.out.print("#");
            }
            System.out.println();
        }
    }

    public static void method2A(int n){
        for(int row = 0; row < n; ++row) {
            for(int col = 0; col < row; ++col) {
                System.out.print("#");
            }
            System.out.println();
        }
    }

    public static void method2B(int n){
        for(int row = 0; row < n; ++row) {
            for(int col = 0; col < n - row; ++col) {
                System.out.print("#");
            }
            System.out.println();
        }
    }

    public static void method2C(int n){
        for(int row = 0; row < n; ++row) {
            for(int col = 0; col < n; ++col) {
                if(row > col) {
                    System.out.print(" ");
                } else {
                    System.out.print("#");
                }
            }
            System.out.println();
        }
    }

    public static void method2D(int n){
        for(int row = 0; row < n; ++row) {
            for(int col = 0; col < n; ++col) {
                if(row > n - 1 - col) {
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void method2E(int n){
        for(int row = 0; row < n; ++row) {
            for(int col = 0; col < n; ++col) {
                if((row == 0) || (row == n - 1)
                || (col == 0) || (col == n - 1)) {
                    System.out.print("#");
                } else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void method2F(int n){
        for(int row = 0; row < n; ++row) {
            for(int col = 0; col < n; ++col) {
                if((row == 0) || (row == n - 1) ||
                        (row == col)) {
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void method2G(int n){
        for(int row = 0; row < n; ++row) {
            for(int col = 0; col < n; ++col) {
                if((row == 0) || (row == n - 1) ||
                        (row == n - 1 - col)) {
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void method2H(int n){
        for(int row = 0; row < n; ++row) {
            for(int col = 0; col < n; ++col) {
                if((row == 0) || (row == n - 1) ||
                        (row == n - 1 - col) || (row == col)) {
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void method2I(int n){
        for(int row = 0; row < n; ++row) {
            for(int col = 0; col < n; ++col) {
                if((row == 0) || (row == n - 1) ||
                        (row == n - 1 - col) || (row == col) ||
                        (col == 0) || (col == n - 1)) {
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

}