package lab2;

import java.util.Scanner;

public class Person extends Account {

	public Person(long accNum, double balance) {
		super(accNum, balance);
		
	}

	String name;
	int age;
	
	public void display()
	{
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name: ");
		String name = sc.nextLine();
		System.out.println("Enter the age: ");
		int age = sc.nextInt();
		Account acc1=new Account(87348927, 2000);
		System.out.println("The balance is: " + acc1.getBalance());
		System.out.println("Enter the name: ");
		String name2 = sc.next();
		System.out.println("Enter the age: ");
		int age2 = sc.nextInt();
		Account acc2=new Account(87367927, 3000);
		System.out.println("The balance is: " + acc2.getBalance());
		acc1.deposit(2000);
		System.out.println("The balance is: " + acc1.getBalance());
		acc2.withdraw(2000);
		System.out.println("The balance is: " + acc2.getBalance());
		
		
	}
}
