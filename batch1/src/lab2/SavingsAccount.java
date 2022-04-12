package lab2;

public class SavingsAccount extends Account {
	
	final int minBalance=500;
	
	public SavingsAccount(long accNum, double balance) {
		super(accNum, balance);
		
	}
	void withdraw(double amount)
	{
		if(amount>=minBalance)
		{
			super.withdraw(amount);
		}
		else
		{
			System.out.println("Minimun balance is 500");
		}
	}
	
	

}
