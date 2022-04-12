package batch1package;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Durationleft {
	
	static void getDuration(String date1)
	{
		LocalDate now = LocalDate.now();
		
		LocalDate tDate1 = LocalDate.parse(date1);
		
		Period p = Period.between(tDate1, now);
		System.out.println("The difference is " + p.getYears() + "years, " + p.getMonths() + "months and " + p.getDays() + "days.");
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the date in format 'yyyy-mm-dd'");
		String date1 = sc.nextLine();
		Durationleft obj = new Durationleft();
		obj.getDuration(date1);
		
		sc.close();

	}

}
