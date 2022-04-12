package lab4;

import java.util.ArrayList;
import java.util.Collections;

public class ques4 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Nokia");
		list.add("Samsung");
		list.add("Motorola");
		list.add("Oneplus");
		Collections.sort(list);
		for (String string : list) {
			System.out.println(string);
		}
		
	}

}
