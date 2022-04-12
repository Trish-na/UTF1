package com.cg.eis.pl;
import java.util.Scanner;
import com.cg.eis.bean.*;
import com.cg.eis.service.*;


public class Main extends Employee implements Service{


	Main(String firstname,String lastname,int id,String designation,int salary)
	{
		super(firstname,lastname,id,designation,salary);
	}


		
		public String InsuranceServices(int salary)
		{
			if(salary>5000 && salary<20000)
				return "Scheme C";
			else if(salary>=20000 && salary<40000)
				return "Scheme B";
			else if(salary>=40000)
				return "Scheme A";
			
			return "No scheme";
		}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the no. of employee's detail you want to add: ");
		int n = sc.nextInt();
		
		for(int i=0; i<n; i++)
		{
			System.out.print("Enter employee's first name: ");
			String firstname = sc.nextLine();
			System.out.println();
			System.out.print("Enter employee's last name: ");
			
			String lastname = sc.nextLine();
			System.out.print("Enter employee's id: ");
			int id = sc.nextInt();
			System.out.print("Enter employee's designation: ");
			String designation = sc.next();
			System.out.println();
			System.out.print("Enter employee's salary: ");
			int salary = sc.nextInt();
			//System.out.print("Enter employee's Insurance scheme: ");
			//String scheme = sc.next();
			Main m = new Main(firstname,lastname,id,designation,salary);
			
			String scheme = m.InsuranceServices(salary);
			System.out.println("------------------------------------------");
			System.out.println("The employee details are: ");
			
			System.out.println("Employee name: " + firstname + " " +lastname);
			System.out.println("Employee id: " + id);
			System.out.println("Employee designation: " + designation);
			System.out.println("Employee salary: " + salary);
			System.out.println("Employee applicable scheme: " + scheme);
			
		}
	}
	
	

}
