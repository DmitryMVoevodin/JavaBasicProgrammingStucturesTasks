package com.netcracker.MyTasks;

public class ElseIfSwitchCase {

    private enum Animal {
        Lion, Tiger, Bear, Giraffe, Crocodile
    }

    private static void elseIfEnum(Animal animal){
        if(animal == Animal.Lion) {
            System.out.print("Lion");
        } else if(animal == Animal.Tiger) {
            System.out.print("Tiger");
        } else if(animal == Animal.Bear) {
            System.out.print("Bear");
        } else if(animal == Animal.Giraffe) {
            System.out.print("Giraffe");
        } else if(animal == Animal.Crocodile) {
            System.out.print("Crocodile");
        } else {
            System.out.print("");
        }
    }

    private static void switchCaseEnum(Animal animal) {
        switch(animal) {
            case Lion:
                System.out.print("Lion");
                break;
            case Tiger:
                System.out.print("Tiger");
                break;
            case Bear:
                System.out.print("Bear");
                break;
            case Giraffe:
                System.out.print("Giraffe");
                break;
            case Crocodile:
                System.out.print("Crocodile");
                break;
            default:
                System.out.print("");
                break;
        }
    }

    public static void compareTimeEnum() {
        long startTime, estimatedTime;
        long totalTimeElseIf = 0, totalTimeSwitchCase = 0;
        Animal[] animalArray = Animal.values();
        for(int i = 0; i < animalArray.length; ++i) {
            startTime = System.nanoTime();
            elseIfEnum(animalArray[i]);
            estimatedTime = System.nanoTime() - startTime;
            totalTimeElseIf += estimatedTime;
            System.out.print(" - ElseIf Time = " + estimatedTime + ";   ");
            startTime = System.nanoTime();
            switchCaseEnum(animalArray[i]);
            estimatedTime = System.nanoTime() - startTime;
            totalTimeSwitchCase += estimatedTime;
            System.out.println(" - SwichCase Time = " + estimatedTime);
        }
        System.out.println();
        System.out.println("totalTimeElseIf = " + totalTimeElseIf +
                ", totalTimeSwitchCase = " + totalTimeSwitchCase);
        System.out.println("averageTimeElseIf = " + 1.0 * totalTimeElseIf / animalArray.length +
                ", averageTimeSwitchCase = " + 1.0 * totalTimeSwitchCase / animalArray.length);
    }

    private static void elseIfArray(int a) {
        if(a == 0) System.out.print(0);
        else if(a == 1) System.out.print(1);
        else if(a == 2) System.out.print(2);
        else if(a == 3) System.out.print(3);
        else if(a == 4) System.out.print(4);
        else if(a == 5) System.out.print(5);
        else if(a == 6) System.out.print(6);
        else if(a == 7) System.out.print(7);
        else if(a == 8) System.out.print(8);
        else if(a == 9) System.out.print(9);
        else if(a == 10) System.out.print(10);
    }

    private static void switchCaseArray(int a) {
        switch(a) {
            case 0: System.out.print(0); break;
            case 1: System.out.print(1); break;
            case 2: System.out.print(2); break;
            case 3: System.out.print(3); break;
            case 4: System.out.print(4); break;
            case 5: System.out.print(5); break;
            case 6: System.out.print(6); break;
            case 7: System.out.print(7); break;
            case 8: System.out.print(8); break;
            case 9: System.out.print(9); break;
            case 10: System.out.print(10); break;
        }
    }

    public static void compareTimeArray() {
        long startTime, estimatedTime;
        long totalTimeElseIf = 0, totalTimeSwitchCase = 0;
        int[] x = OneDimensionalArray.createRandomArray(50,0,10);
        int[] frequency = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        for(int i = 0; i < x.length; ++i) {
            startTime = System.nanoTime();
            elseIfArray(x[i]);
            estimatedTime = System.nanoTime() - startTime;
            totalTimeElseIf += estimatedTime;
            System.out.print(" - ElseIf Time = " + estimatedTime + ";   ");
            startTime = System.nanoTime();
            switchCaseArray(x[i]);
            estimatedTime = System.nanoTime() - startTime;
            totalTimeSwitchCase += estimatedTime;
            System.out.println(" - SwichCase Time = " + estimatedTime);
            frequency[x[i]]++;
        }
        System.out.println();
        System.out.println("totalTimeElseIf = " + totalTimeElseIf +
                ", totalTimeSwitchCase = " + totalTimeSwitchCase);
        System.out.println("averageTimeElseIf = " + 1.0 * totalTimeElseIf / x.length +
                ", averageTimeSwitchCase = " + 1.0 * totalTimeSwitchCase / x.length);
        for(int i = 0; i < frequency.length; ++i) {
            System.out.print(i + "(" + frequency[i] + " times); ");
        }
        System.out.println();
    }

}
