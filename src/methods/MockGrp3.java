package methods;

public class MockGrp3 {

	public static void main(String[] args)
	{
		MockGrp3 Info=new MockGrp3();
		System.out.println("*=========Info of student 1==========*");
		Info.MG3("Sunil Kamble", 25.5f, 'M', false, "Mechanical");
		
		System.out.println("*=========Info of student 2==========*");
		Info.MG3("Prasad Gaikwad", 22f, 'M', true, "BSC");
		
		System.out.println("*=========Info of student 3==========*");
		Info.MG3("Avishkar Jadhav", 25.6f, 'M', false, "Mechanical");
		
		System.out.println("*=========Info of student 4==========*");
		Info.MG3("Katyayani Nagare", 25f, 'F', false, "Electronics and communication");
		
		System.out.println("*=========Info of student 5==========*");
		Info.MG3("Yogita Borde", 29f, 'F', true, "Computer");
		
		System.out.println("*=========Info of student 6==========*");
		Info.MG3("Snehali Parsutkar", 23f, 'F', false, "BCA");
	

	}

	public void MG3(String Name,float Age,char Gender, boolean Address,String Branch)
	{
		System.out.println("Name           : "+ Name);
		System.out.println("Age            : "+ Age);
		System.out.println("Gender         : "+ Gender);
		System.out.println("Living in Pune : "+ Address);
		System.out.println("Branch         : "+ Branch);
		
	}
	
}
