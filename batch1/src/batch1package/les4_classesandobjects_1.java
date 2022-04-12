package batch1package;

public class les4_classesandobjects_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Box volume=new Box(  );
		volume.calVolume();

	}

}
class Box{
	
	double dbwidth;
	double dbheight;
	double dbdepth;
	
	double calVolume() {
		System.out.println(dbwidth*dbheight*dbdepth);
		return dbwidth*dbheight*dbdepth;
	}
}