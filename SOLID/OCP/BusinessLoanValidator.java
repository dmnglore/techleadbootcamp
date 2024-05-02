
public class BusinessLoanValidator {
	
	private static final int MINIMUM_BUSINESS_BALANCE = 2000;

	public BusinessLoanValidator() {
		super();
	}

	public boolean isValid(int balance) {
		if (balance > MINIMUM_BUSINESS_BALANCE)
			return true;
		else 
			return false;
	}

}
