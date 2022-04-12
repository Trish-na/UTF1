package batch1package;

public class ques7 {

	String firstName;
	String lastName;
	char gender;
	String phone;
	
	public ques7()
	{
		this.firstName="Divya";
		this.lastName="Bharathi";
		this.gender='F';
	}
	
	String phoneno()
	{
		phone = "7897895778";
		return phone;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ques7 obj=new ques7();
		
		System.out.println(obj.firstName);
		System.out.println(obj.lastName);
		System.out.println(obj.gender);
		System.out.println(obj.phoneno());

	}
}
