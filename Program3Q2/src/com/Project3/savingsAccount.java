package com.Project3;

public class savingsAccount {
    static private double air;
    private double savingsBalance;

    public static void InterestRate(double newInterestRate) {
        air = newInterestRate;
    }

    public savingsAccount(double savingBalance) {
        this.savingsBalance = savingBalance;
    }

    public double SavingBalance() {
        return this.savingsBalance;
    }

    public void calculateMonthlyInterest() {
        double monthlyI;
        monthlyI = (double) (this.savingsBalance * air / 12);
        this.savingsBalance += monthlyI;
    }

    public static void main(String[] args) {
        int total = 0;
        savingsAccount person1, person2;
        person1 = new savingsAccount(2000);
        person2 = new savingsAccount(3000);
        savingsAccount.InterestRate(.04);
        System.out.println("Balance for person 1: ");
        for (int i = 0; i < 12; i++){
            person1.calculateMonthlyInterest();
            System.out.printf("Month %d: %.2f\n", (i+1), person1.SavingBalance());
        }
        System.out.println("\nBalance for person 2: ");
        for (int i = 0; i < 12; i++){
            person2.calculateMonthlyInterest();
            System.out.printf("Month %d: %.2f\n", (i+1), person2.SavingBalance());
        }
        savingsAccount.InterestRate(.05);
        System.out.println("\nPerson 1 with a 5%% interest rate");
        for (int i = 0; i < 12; i++){
            person1.calculateMonthlyInterest();
            System.out.printf("Month %d: %.2f\n", (i+1),person1.SavingBalance());
        }
        System.out.println("\nPerson 2 with a 5%% interest rate");
        for (int i = 0; i < 12; i++){
            person2.calculateMonthlyInterest();
            System.out.printf("Month %d: %.2f\n", (i+1),person2.SavingBalance());
        }


    }
}
