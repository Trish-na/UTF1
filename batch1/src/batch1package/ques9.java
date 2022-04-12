package batch1package;
import java.util.Scanner;


public class ques9 {
	
	public static String toString(char a[])
	{
		String str=new String(a);
		return str;
	}
	static String oddPosition(String s)
	{
		char ch[] = s.toCharArray();
		for (int i = 1; i < ch.length; i=i+2) {
			if(ch[i]==' ')
				i++;
			else
				ch[i]='#';	
		}
		s=toString(ch);
		return s;
	}
	
	static String upperCase(String s)
	{
		char ch[] = s.toCharArray();
		for (int i = 1; i < ch.length; i=i+2) {
			ch[i]= Character.toUpperCase(ch[i]);	
		}
		s=toString(ch);
		return s;
	}
	
	static String delDuplicates(String s)
	{
		String str=new String();
		for (int i = 0; i < s.length(); i++) {
			char ch=s.charAt(i);
			if(str.indexOf(ch)<0)
				str += ch;
			
		}
		return str;
	}
	
	public static void main(String[] args) {
		String str;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string:");
		str=sc.nextLine();
		ques9 obj=new ques9();
		System.out.println("Enter:\n"+ "1. to replace # in odd postions\n" + "2. to uppercase odd position\n" + "3. to delete duplicates");
		int i = sc.nextInt();
		switch(i) {
		case 1: 
			String str1=obj.oddPosition(str);
			System.out.println(str1);
			break;
		case 2:
			String str2=obj.upperCase(str);
			System.out.println(str2);
			break;
		case 3:
			String str3=obj.delDuplicates(str);
			System.out.println(str3);
			break;
		}
		
	}

}
