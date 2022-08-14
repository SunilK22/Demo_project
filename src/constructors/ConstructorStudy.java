package constructors;

public class ConstructorStudy {
	
	int A;
	int B;
	
public static void main(String[] args) 
	{
	ConstructorStudy C=new ConstructorStudy();
	C.addition();

	}
	public ConstructorStudy()
	{
	A=10;
	B=-5;
		System.out.println("Hi i am constructor");
	}
	
	public void addition()
	{
		int Sum=A+B;
		System.out.println("Sum of A and B is "+ Sum);
	}

	
}
