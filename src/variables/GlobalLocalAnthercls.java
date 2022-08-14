package variables;

public class GlobalLocalAnthercls {
	
	int a=10;
	int b=20;
	
	static int c=15;
	static int d=25;

	public static void main(String[] args) 
	{
		GL1();
		
		GlobalLocalAnthercls GL=new GlobalLocalAnthercls();
		GL.GL2();
		
		Demo1 d=new Demo1();
		d.DM1();
	
		Demo1.DM2();
        
	}
	
	public static void GL1()
	{
		int sum=c+d;
		System.out.println("Sum of c and d is "+ sum);
	}
	public void GL2()
	{
		int sub=a-b;
		System.out.println("Substraction of a and b is "+sub);
	}

}
