package com.workshop.ctdd.testdoubles;

public class LoanCalculator {
    public double calculateInterest(double principal, double rate, int duration) {
        // Simple interest calculation formula: Interest = (Principal * Rate * Duration) / 100
        return (principal * rate * duration) / 100;
    }

}