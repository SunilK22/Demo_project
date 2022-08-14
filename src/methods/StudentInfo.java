package methods;

public class StudentInfo {

	public static void main(String[] args) 
	{
		System.out.println("-----------Static method call from same class----------------");
			Student1();	
			
		System.out.println("-----------Non static method call from same class------------");
			StudentInfo stud2=new StudentInfo();
			stud2.Student2();
	}

	public static void Student1()
	{
		String Name="Sunil";
		char Gender='M';
		float Age=25.6f;
		String Dept="Mechanical";
		
		System.out.println("Name of student1 is "+ Name);
		System.out.println("Gender of student1 is "+ Gender);
		System.out.println("Age of student1 is "+Age );
		System.out.println("Department of student1 is "+Dept );
	}
	//=============================================================================
	public void Student2()
	{
		String Name="SVK";
		char Gender='M';
		float Age=306.92f;
		String Dept="Mechanical Engineering";
		
		System.out.println("Name of student2 is "+ Name);
		System.out.println("Gender of student2 is "+ Gender);
		System.out.println("Age of student2 is "+Age +" months");
		System.out.println("Department of student2 is "+Dept );
	}
	
}
