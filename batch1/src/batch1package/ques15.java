package batch1package;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;


public class ques15 {
	String firstName;
	String lastName;
	
	static void getFullName(String firstName, String lastName)
	{
		System.out.println(firstName + " " + lastName);
	}
	static void calculateAge(String dob)
	{
		LocalDate date = LocalDate.parse(dob);
		LocalDate now = LocalDate.now();
		Period p = Period.between(date, now);
		System.out.println("Your age is " + p.getYears() + "years, " + p.getMonths() + "months and " + p.getDays() + "days.");

	}
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		ques15 obj=new ques15();
		System.out.print("Enter your first name: ");
		obj.firstName = sc.nextLine();
		System.out.print("Enter your last name: ");
		obj.lastName = sc.nextLine();
		
		System.out.print("Enter the date of birth in format 'yyyy-mm-dd: ");
		String dob = sc.nextLine();
		obj.getFullName(obj.firstName, obj.lastName);
		obj.calculateAge(dob);
		
	}

}
