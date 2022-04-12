package lab4;

import java.util.HashMap;
import java.util.Scanner;

public class ques5 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Scanner s = new Scanner(System.in);
		HashMap<String, String> map = new HashMap<String, String>();
		System.out.println("Enter the no. of employee's details you want to add:");
		int n=sc.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.println("Enter the scheme:");
			String scheme = sc.nextLine();
			sc.nextLine();
			System.out.println("Enter the employee name:");
			String name = sc.nextLine();
			
			map.put(scheme,name);
		}
		
		System.out.println(map);
		System.out.println(map.get("Scheme B"));
		
	
	}

}
