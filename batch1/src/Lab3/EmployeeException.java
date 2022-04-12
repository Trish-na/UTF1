package Lab3;

import java.util.Scanner;

public class EmployeeException extends Exception {
	
	public EmployeeException(String s) {
		super(s);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the employee salary: ");
		int salary=sc.nextInt();
		try {
			if(salary<3000)
				throw new EmployeeException("The salary is below Rs.3000");
		}
		catch(EmployeeException e) {
			System.out.println("Exception: " + e.getMessage());
		}
	}
	
}
