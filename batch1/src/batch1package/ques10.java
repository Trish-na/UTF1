package batch1package;

import java.util.Scanner;

public class ques10 {
	static boolean checkString(String s)
	{
		s=s.toUpperCase();
		for (int i = 1; i < s.length(); i++) {
			if(s.charAt(i) < s.charAt(i-1))
				return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		String str;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string:");
		str=sc.nextLine();
		ques10 obj=new ques10();
		System.out.println(obj.checkString(str));
	}

}
