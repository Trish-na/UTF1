package lab2;

public class CurrentAccount extends Account{
	
	static int overDraftLimit=1000;

	public CurrentAccount(long accNum, double balance) {
		super(accNum, balance);
	}
	
	
	static boolean withdraw(int amount)
	{
		if(amount==overDraftLimit)
			return true;
		else
			return false;
	}
	
}
