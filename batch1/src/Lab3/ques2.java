package Lab3;

import java.util.Scanner;

public class ques2 {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the age: ");
		try {
			int age=sc.nextInt();
			if(age<15)
					throw new Exception("Age should be grater than 15");
			}
		catch(Exception e)
		{
			e.printStackTrace();
			
			}
	}

}
