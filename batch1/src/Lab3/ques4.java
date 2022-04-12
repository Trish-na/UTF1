package Lab3;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class ques4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no. of product names you want to enter: ");
		int num = sc.nextInt();
		String[] productNames = new String[num];
		System.out.println("Enter the product names: ");
		for (int i = 0; i < productNames.length; i++) {
			productNames[i] = sc.next();
		}
		Arrays.sort(productNames);
		System.out.println("The sorted array is:");
		for (String string : productNames) {
			System.out.println(string);
		}
		
	}
}
