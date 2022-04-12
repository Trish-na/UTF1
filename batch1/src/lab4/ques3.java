package lab4;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ques3 {

	public static void main(String[] args) {
		try {

			File fileemp = new File("C:\\Batch1\\batch1\\src\\lab4\\employee.txt");
			//FileReader filetext = new FileReader("C:\\Batch1\\batch1\\src\\lab4\\numbers.txt");
			Scanner sc=new Scanner(fileemp);
			while(sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
			sc.close();
		}catch(IOException e) {
			System.out.println("Exception");
		}

	}

}
