package lab4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ques2 {

	public static void main(String[] args)  {
		
		try {

			File fileno = new File("C:\\Batch1\\batch1\\src\\lab4\\numbers.txt");
			//FileReader filetext = new FileReader("C:\\Batch1\\batch1\\src\\lab4\\numbers.txt");
			Scanner sc=new Scanner(fileno);
			
			sc.useDelimiter(",");
			while(sc.hasNextInt()) {
				int i = sc.nextInt();
				if(i%2==0)
					System.out.println(i);
			}
			sc.close();
		}catch(IOException e) {
				System.out.println("Exception");
			}
	

}
}
