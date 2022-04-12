package com.cg.eis.bean;



public class Employee  extends Exception{
	
	int id;
	static String firstname;
	static String lastname;
	int salary;
	String designation;
	String insuranceScheme;
	
	
	public Employee(String firstname, String lastname, int id, String designation, int salary) {
		// TODO Auto-generated constructor stub
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		
		this.designation = designation;
		this.salary = salary;
		//this.insuranceScheme = scheme;
	}
	


public static void main(String[] args) {
	
	try {
		if( Employee.firstname== " " || Employee.lastname == "\n")
			throw new Exception("The name should not be kept blank");
	}
	catch(Exception ex)
	{
		System.out.println(ex.getMessage());
	}

}	

}


