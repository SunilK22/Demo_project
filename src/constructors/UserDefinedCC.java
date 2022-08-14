package constructors;

public class UserDefinedCC {

	int a;
	int b;
	public static void main(String[] args) 
	{
		UserDefinedCC cc2=new UserDefinedCC();
        cc2.Add();
        
        UserDefinedCC cc3=new UserDefinedCC(30);
        cc3.Add();
        
        UserDefinedCC cc4=new UserDefinedCC(40, 50);
        cc4.Add();
	}
	
	public UserDefinedCC()
	{
		a=5;
		b=20;
		System.out.println("Hi I am constructor");
		
	}
	public UserDefinedCC(int num)
	{
		a=num;
		//b=0 default
	}
	public UserDefinedCC(int num1, int num2)
	{
		a=num1;
		b=num2;
	}
	public void Add()
	{
		int sum=a+b;
		System.out.println("Adition of a and b is "+sum);
	}

}
