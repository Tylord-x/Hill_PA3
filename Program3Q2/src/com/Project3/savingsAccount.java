package com.Project3;

public class savingsAccount {
    static private double air;
    private double savingsBalance;

    public static void modifyInterestRate(double newInterestRate) {
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
        person1 = new savingsAccount(2000.0);
        person2 = new savingsAccount(3000.0);
        
    }
}
