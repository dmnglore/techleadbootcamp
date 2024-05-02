package com.craft.solid.OCP;

import com.craft.solid.nonOCP.PersonalLoanValidator;

public class LoanRequestHandler {
	private int balance;
	private int period;

	public LoanRequestHandler(int balance, int period) {
		super();
		this.balance = balance;
		this.period = period;
	}

	public void approveLoan(Validator validator) {
		if (validator.isValid(balance)) {
			// SANCTION THE LOAN
			System.out.println("Loan Approved .....");
		} else {
			System.out.println("Sorry not enough balance.........");

		}

	}
}
