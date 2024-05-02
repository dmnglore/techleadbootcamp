package com.craft.solid.nonOCP;

public class LoanRequestHandler {

	private int balance;
	private int period;

	public LoanRequestHandler(int balance, int period) {
		super();
		this.balance = balance;
		this.period = period;
	}

	public void approveLoan(PersonalLoanValidator validator) {
		if (validator.isValid(balance)) {
			// SANCTION THE LOAN
			System.out.println("Loan Approved .....");
		} else {
			System.out.println("Sorry not enough balance.........");

		}

	}
}
