package Lab3;

import java.util.Scanner;

public class ques1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the firstname: ");
		System.out.println("enter the lastname: ");
		try {
			String firstname=sc.nextLine();
			System.out.println();
			String lastname=sc.nextLine();
			if(firstname!=null || firstname.isEmpty() && lastname != null || lastname.isEmpty())
				throw new Exception("Name cannot be blank");
			}
		catch(Exception e)
		{
			e.printStackTrace();
			
			}
	}
}
