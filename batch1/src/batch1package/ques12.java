package batch1package;
import java.util.*;
import java.time.*;

public class ques12 {
	
	static void getDuration(String date1, String date2)
	{
		LocalDate tDate1 = LocalDate.parse(date1);
		
		LocalDate tDate2 = LocalDate.parse(date2);
		
		Period p = Period.between(tDate1, tDate2);
		System.out.println("The difference is " + p.getYears() + "years, " + p.getMonths() + "months, and " + p.getDays() + "days.");
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the date in format 'yyyy-mm-dd'");
		String date1 = sc.nextLine();
		System.out.println("Enter the date in format 'yyyy-mm-dd'");
		String date2 = sc.nextLine();
		ques12 obj=new ques12();
		obj.getDuration(date1, date2);
	}
	

}
