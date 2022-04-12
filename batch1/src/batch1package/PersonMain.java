package batch1package;

public class PersonMain {
	
	String firstName;
	String lastName;
	char gender;
	
	public PersonMain()
	{
		this.firstName="Divya";
		this.lastName="Bharathi";
		this.gender='F';
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		PersonMain obj=new PersonMain();
		System.out.println(obj.firstName);
		System.out.println(obj.lastName);
		System.out.println(obj.gender);

	}

}
