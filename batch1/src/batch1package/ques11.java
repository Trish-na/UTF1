package batch1package;
import java.util.*;

public class ques11 {
//	static void duration(int d, int m, int y)
//	{
//		System.out.println("Enter today's date:");
//		System.out.println("Enter year");
//		int yr=sc.nextInt();
//		System.out.println("Enter month");
//		int mon=sc.nextInt();
//		System.out.println("Enter date");
//		int dt=sc.nextInt();
//		if(yr==y)
//		{
//			if(mon==m)
//			{
//				System.out.printf("%d" + "of days left\n",d-dt);
//			}
//			else
//			{
//				if(d<=dt)
//					System.out.printf("%d" + "of days left\n",dt-d);
//				else
//					System.out.printf("%d" + "of days left\n" +"and" + "%d" + "months left",dt-d,m-mon);
//			}
//		}
//		else
//		{
//			if(m>=mon)
//			{
//				if(dt==d)
//					System.out.printf("%d" + "of years left\n",y-yr);
//				else if(d>dt)
//					System.out.printf("%d" + "of days "+ "and" + "%d" + "years left\n",d-dt,y-yr);
//				else
//					System.out.printf( "11months " + "and " + "%d" + "of days left\n",dt-d);
//			}
//			else if(m<mon)
//			{
//				if(d>dt)
//					System.out.printf("%d" + "months" + " and " + "%d" + "days left\n",12-m,d-dt);
//				else
//					System.out.printf("%d" + "months" + " and " + "%d" + "days left\n",11-m,dt-d);
//			}
//		}
//	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the date:");
		System.out.println("Enter year");
		int y=sc.nextInt();
		System.out.println("Enter month");
		int m=sc.nextInt();
		System.out.println("Enter date");
		int d=sc.nextInt();
		
		System.out.println("Enter today's date:");
		int yr=2022;
		int mon=3;
		int dt=28;
//		System.out.println("Enter year");
//		int yr=sc.nextInt();
//		System.out.println("Enter month");
//		int mon=sc.nextInt();
//		System.out.println("Enter date");
//		int dt=sc.nextInt();
		if(yr==y)
		{
			if(mon==m)
			{
				System.out.printf("%d" + " of days left\n",d-dt);
			}
			else
			{
				if(d>=dt)
					System.out.printf("%d" + " of days" + " and " + "%d" + "months left\n",dt-d,m-mon);
				else
					System.out.printf("%d" + "days " +"and " + "%d" + "months left",d-dt,m-mon);
			}
		}
		else
		{
			if(m>=mon)
			{
				if(dt==d)
					System.out.printf("%d" + " of years left\n",y-yr);
				else if(d>dt)
					System.out.printf("%d" + " of days "+ "and" + "%d" + "years left\n",d-dt,y-yr);
				else
					System.out.printf( "11months " + "and " + "%d" + "of days left\n",dt-d);
			}
			else if(m<mon)
			{
				if(d>dt)
					System.out.printf("%d" + "months" + " and " + "%d" + "days left\n",12-m,d-dt);
				else
					System.out.printf("%d" + "months" + " and " + "%d" + "days left\n",11-m,dt-d);
			}
		}
	}

}
