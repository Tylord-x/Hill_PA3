package com.Project3;

import java.util.Random;
import java.util.Scanner;

public class Main {
    static int correctanswer, count;
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
        static int multiplication ( int n1, int n2){
            int m = n1 * n2;
            while (true) {
                System.out.println("How much is " + n1 + " times " + n2 + "?");
                int n3 = scnr.nextInt();
                if (n3 == m) {
                    correct();
                    correctanswer++;
                    break;
                }
                else {
                    incorrect();
                    break;
                }
            }
            return 0;
        }

        public static void main (String[]args){
            int n1, n2, diff;
            System.out.println("Enter a difficulty level: ");
            System.out.println("1. As large as Single Digit Numbers");
            System.out.println("2. As large as Double Digit Numbers");
            System.out.println("3. As Large as Triple Digit Numbers");
            System.out.println("4. As Large as Four Digit Numbers");
            System.out.print("Enter choice: ");
            diff = scnr.nextInt();
            switch(diff) {
                case 1:
                    while (count < 10) {
                        count++;
                        n1 = SecureRandom.nextInt(10);
                        n2 = SecureRandom.nextInt(10);
                        multiplication(n1, n2);
                    }
                case 2:
                    while (count < 10) {
                        count++;
                        n1 = SecureRandom.nextInt(100);
                        n2 = SecureRandom.nextInt(100);
                        multiplication(n1, n2);
                    }
                case 3:
                    while (count < 10) {
                        count++;
                        n1 = SecureRandom.nextInt(1000);
                        n2 = SecureRandom.nextInt(1000);
                        multiplication(n1, n2);
                    }
                case 4:
                    while (count < 10) {
                        count++;
                        n1 = SecureRandom.nextInt(10000);
                        n2 = SecureRandom.nextInt(10000);
                        multiplication(n1, n2);
                    }
            }
            System.out.printf("Your percentage was %d%%\n", (correctanswer/count)*100);
            if (correctanswer > 7.5){
                System.out.println("Congratulations, you are ready to go to the next level!");
            }
            else System.out.println("Please ask your teacher for extra help.");
        }
    }