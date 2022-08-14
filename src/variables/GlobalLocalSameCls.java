package variables;

public class GlobalLocalSameCls {
	// calling non static global variable from same class
	int a=10;
	int b=15;

	public static void main(String[] args) 
	{
		GlobalLocalSameCls gv=new GlobalLocalSameCls();
		gv.GVcall();

	}
	
	public void GVcall()
	{
		int sum=a+b;
		int sub=a-b;
		int multi=a*b;
		System.out.println("Addition of a and b is "+sum);
		System.out.println("Substraction of a and b is "+sub);
		System.out.println("Multiplication of a and b is "+multi);
	}

}
