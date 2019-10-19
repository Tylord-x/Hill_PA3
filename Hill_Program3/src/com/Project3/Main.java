package com.Project3;

import java.util.Random;
import java.util.Scanner;

public class Main {
    static Scanner scnr = new Scanner(System.in);
    static int multiplication(int n1, int n2) {
        int m = n1 * n2;
        while (true) {
            System.out.println("How much is " + n1 + " times " + n2 + "?");
            int n3 = scnr.nextInt();
            if (n3 == m6){
                System.out.println("Very Good");
                break;
            } else {
                System.out.println("No, Please try again");
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int n1, n2;
        while (true) {
            Random SecureRandom = new Random();
            n1 = SecureRandom.nextInt(10);
            n2 = SecureRandom.nextInt(10);
            multiplication(n1, n2);
        }
    }
}