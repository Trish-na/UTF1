package batch1package;

public class ques8 {
	
	String firstName;
	String lastName;
	char gender;
	String phone;
	
	public ques8()
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
		
		
		ques8 obj=new ques8();
		
		System.out.println(obj.firstName);
		System.out.println(obj.lastName);
		System.out.println(obj.gender);
		System.out.println(obj.phoneno());

	}

}
