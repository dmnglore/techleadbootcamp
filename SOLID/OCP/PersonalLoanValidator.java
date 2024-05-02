package com.craft.solid.OCP;

public class PersonalLoanValidator {
	
	private static final int MINIMUM_PERSONAL_BALANCE = 50000;
	public PersonalLoanValidator() {
		super();
	}

	public boolean isValid(int balance) {
		if (balance > MINIMUM_PERSONAL_BALANCE)
			return true;
		else 
			return false;
	}


}
