package com.Project3;

import java.util.Random;
import java.util.Scanner;

public class Main {
    static int correctanswer, count, incorrectanswer;
    static int n = 1;
    static Random SecureRandom = new Random();
    static void correct() {
        int correct = SecureRandom.nextInt(4);
        switch (correct) {
            case 0:
                System.out.println("Very Good !");
                break;
            case 1:
                System.out.println("Excellent !");
                break;
            case 2:
                System.out.println("Nice Work !");
                break;
            case 3:
                System.out.println("Keep up the good work !");
                break;
        }
    }
    static void incorrect() {
        int incorrect = SecureRandom.nextInt(4);
        switch (incorrect) {
            case 0:
                System.out.println("No. Please try again.");
                break;
            case 1:
                System.out.println("Wrong. Try once more.");
                break;
            case 2:
                System.out.println("Don't give up!");
                break;
            case 3:
                System.out.println("No. Keep trying. ");
                break;
        }
    }
        static Scanner scnr = new Scanner(System.in);
        static double multiplication (double n1, double n2){
            double m = n1 * n2;
            while (true) {
                System.out.println("How much is " + n1 + " times " + n2 + "?");
                double n3 = scnr.nextDouble();
                if (n3 == m) {
                    correct();
                    correctanswer++;
                    break;
                }
                else {
                    incorrect();
                    incorrectanswer++;
                    break;
                }
            }
            return 0;
        }
    static double addition (double n1, double n2){
        double m = n1 + n2;
        while (true) {
            System.out.println("How much is " + n1 + " plus " + n2 + "?");
            double n3 = scnr.nextDouble();
            if (n3 == m) {
                correct();
                correctanswer++;
                break;
            }
            else {
                incorrect();
                incorrectanswer++;
                break;
            }
        }
        return 0;
    }
    static double subtraction (double n1, double n2){
        double m = n1 - n2;
        while (true) {
            System.out.println("How much is " + n1 + " minus " + n2 + "?");
            double n3 = scnr.nextDouble();
            if (n3 == m) {
                correct();
                correctanswer++;
                break;
            }
            else {
                incorrect();
                incorrectanswer++;
                break;
            }
        }
        return 0;
    }
    static double division (double n1, double n2){
        double m = n1 / n2;
        while (true) {
            System.out.println("How much is " + n1 + " divided by " + n2 + "?");
            double n3 = scnr.nextDouble();
            if (n3 == m) {
                correct();
                correctanswer++;
                break;
            }
            else {
                incorrect();
                incorrectanswer++;
                break;
            }
        }
        return 0;
    }
    static double random (double n1, double n2){
        int rand = SecureRandom.nextInt(4);
        switch (rand) {
            case 1:
                double m = n1 * n2;
                while (true) {
                    System.out.println("How much is " + n1 + " times " + n2 + "?");
                    double n3 = scnr.nextDouble();
                    if (n3 == m) {
                        correct();
                        correctanswer++;
                        break;
                    }
                    else {
                        incorrect();
                        incorrectanswer++;
                        break;
                    }
                }
                break;
            case 2:
                double m1 = n1 + n2;
                while (true) {
                    System.out.println("How much is " + n1 + " plus " + n2 + "?");
                    double n3 = scnr.nextDouble();
                    if (n3 == m1) {
                        correct();
                        correctanswer++;
                        break;
                    }
                    else {
                        incorrect();
                        incorrectanswer++;
                        break;
                    }
                }
                break;
            case 3:
                double m2 = n1 - n2;
                while (true) {
                    System.out.println("How much is " + n1 + " minus " + n2 + "?");
                    double n3 = scnr.nextDouble();
                    if (n3 == m2) {
                        correct();
                        correctanswer++;
                        break;
                    }
                    else {
                        incorrect();
                        incorrectanswer++;
                        break;
                    }
                }
                break;
            case 4:
                double m3 = n1 / n2;
                while (true) {
                    System.out.println("How much is " + n1 + " divided by " + n2 + "?");
                    double n3 = scnr.nextDouble();
                    if (n3 == m3) {
                        correct();
                        correctanswer++;
                        break;
                    }
                    else {
                        incorrect();
                        incorrectanswer++;
                        break;
                    }
                }
        }
        return 0;
    }


        public static void main (String[]args){
            while (n == 1){
            int n1, n2, diff, eq;
            count = 0;
            correctanswer = 0;
            incorrectanswer = 0;
            System.out.println("Enter a difficulty level: ");
            System.out.println("1. As large as Single Digit Numbers");
            System.out.println("2. As large as Double Digit Numbers");
            System.out.println("3. As Large as Triple Digit Numbers");
            System.out.println("4. As Large as Four Digit Numbers");
            System.out.print("Enter choice: ");
            diff = scnr.nextInt();
            System.out.println("\nWhat kind of equation do you want to perform: ");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Mixture of all 4.");
            System.out.print("Enter choice: ");
            eq = scnr.nextInt();
            switch(diff) {
                case 1:
                    while (count < 10) {
                        count++;
                        n1 = SecureRandom.nextInt(10);
                        n2 = SecureRandom.nextInt(10);
                        switch(eq){
                            case 1:
                                addition(n1,n2);
                                break;
                            case 2:
                                subtraction(n1, n2);
                                break;
                            case 3:
                                multiplication(n1, n2);
                                break;
                            case 4:
                                division(n1, n2);
                                break;
                            case 5:
                                random(n1, n2);
                                break;
                        }
                    }
                    break;
                case 2:
                    while (count < 10) {
                        count++;
                        n1 = SecureRandom.nextInt(100);
                        n2 = SecureRandom.nextInt(100);
                        switch(eq){
                            case 1:
                                addition(n1,n2);
                                break;
                            case 2:
                                subtraction(n1, n2);
                                break;
                            case 3:
                                multiplication(n1, n2);
                                break;
                            case 4:
                                division(n1, n2);
                                break;
                            case 5:
                                random(n1, n2);
                                break;
                        }
                    }
                    break;
                case 3:
                    while (count < 10) {
                        count++;
                        n1 = SecureRandom.nextInt(1000);
                        n2 = SecureRandom.nextInt(1000);
                        switch(eq){
                            case 1:
                                addition(n1,n2);
                                break;
                            case 2:
                                subtraction(n1, n2);
                                break;
                            case 3:
                                multiplication(n1, n2);
                                break;
                            case 4:
                                division(n1, n2);
                                break;
                            case 5:
                                random(n1, n2);
                                break;
                        }
                    }
                    break;
                case 4:
                    while (count < 10) {
                        count++;
                        n1 = SecureRandom.nextInt(10000);
                        n2 = SecureRandom.nextInt(10000);
                        switch(eq){
                            case 1:
                                addition(n1,n2);
                                break;
                            case 2:
                                subtraction(n1, n2);
                                break;
                            case 3:
                                multiplication(n1, n2);
                                break;
                            case 4:
                                division(n1, n2);
                                break;
                            case 5:
                                random(n1, n2);
                                break;
                        }
                    }
                    break;
            }
            float percent = (float)correctanswer/(correctanswer+incorrectanswer);
            System.out.printf("You had %d correct answers\n", correctanswer);
            System.out.printf("You had %d incorrect answers\n", incorrectanswer);
            System.out.printf("Your percentage was %.2f%%\n", (percent*100));
            if (correctanswer > 7.5){
                System.out.println("Congratulations, you are ready to go to the next level!");
            }
            else {
                System.out.println("Please ask your teacher for extra help.");
            }
            System.out.println("Do you want to continue?");
            System.out.print("1 for yes. Any other number for no. ");
            n = scnr.nextInt();
            System.out.print("\n\n");
            }
        }
}
