package lab2;

public class Account {
	
	long accNum;
	double balance;
	//Person accHolder;
	
	public Account(long accNum, double balance) {
		this.accNum = accNum;
		this.balance=balance;
		
	}
	
	
	void deposit(double amount)
	{
		amount = amount + balance;
		System.out.println("The balance is: " + amount);
	}
	
	void withdraw(double amount)
	{
		amount = balance - amount; 
		System.out.println("The balance is: " + amount);
	}
	
	static boolean withdraw(int amount)
	{
		if (CurrentAccount.withdraw(amount)==true)
			return true;
		else
			return false;
	}
	
	double getBalance()
	{
		return balance;
	}

}
