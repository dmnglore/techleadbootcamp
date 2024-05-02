package com.craft.solid.nonOCP;

public class PersonalLoanValidator {
	private static final int MINIMUM_PERSONAL_BALANCE = 2000;

	public PersonalLoanValidator() {
		
	}
	
	public boolean isValid(int balance) {
		if (balance > MINIMUM_PERSONAL_BALANCE)
			return true;
		else 
			return false;
	}
	
}
