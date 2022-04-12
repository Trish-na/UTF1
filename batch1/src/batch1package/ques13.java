package batch1package;

import java.time.*;
import java.time.temporal.*;

import java.util.Scanner;

public class ques13 {
	
	static void getDuration(String date, int yr, int mon)
	{
		LocalDate purchaseDate = LocalDate.parse(date);
		
		Period p1 = Period.ofYears(yr);
		Temporal temp1 = p1.addTo(purchaseDate);
		Period p2 = Period.ofMonths(mon);
		Temporal temp2 = p2.addTo(temp1);
		System.out.print("The waranty period is till: " + temp2);
		
	}
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the date in format 'yyyy-mm-dd': ");
		String date1 = sc.nextLine();
		System.out.print("Enter the no. of years in waranty period: ");
		int yr = sc.nextInt();	
		System.out.print("Enter the no. of months in waranty period: ");
		int mon = sc.nextInt();
		ques13 obj=new ques13();
		obj.getDuration(date1, yr, mon);
	}

}
