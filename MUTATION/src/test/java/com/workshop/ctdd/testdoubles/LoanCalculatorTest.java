package com.workshop.ctdd.testdoubles;

import org.junit.Test;
import static org.junit.Assert.*;

public class LoanCalculatorTest {
    
    @Test
    public void testCalculateInterest() {
        LoanCalculator calculator = new LoanCalculator();
        double principal =1000;
        double rate = 5.0; // 5% interest rate
        int duration = 2; // 2 years
        
        double expectedInterest = 100; // Expected interest: (1000 * 5 * 2) / 100 = 100
        //double actualInterest = calculator.calculateInterest(principal, rate, duration);
        
       // assertEquals(expectedInterest, actualInterest, 0.01); // Allowing a small delta for floating point precision
    }
    
    @Test
    public void testCalculateInterest_MutationDetection() {
        LoanCalculator calculator = new LoanCalculator();
        double principal = 1;//1000;
        double rate = 1;//5.0; // 5% interest rate
        int duration = 2; // 2 years
        
        double mutatedExpectedInterest = 210; // Mutated expected interest: (1000 + 5 * 2) / 100 = 210
        double actualInterest = calculator.calculateInterest(principal, rate, duration);
        
        
        //assertFalse("Detected mutation: expected interest is not equal to actual interest.", mutatedExpectedInterest == actualInterest);
    }
}
