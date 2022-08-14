package constructors;

public class DefaultConstructorCall {

	public static void main(String[] args) 
	{
		/* constructor is special type of method 
		 * it is a non static method so that to call it object needs to be created
		 * by creating object by default compiler gives call to constructor if it is not called by user*/
		
//		DefaultConstructorCall cc1=new DefaultConstructorCall();  // object created

	}
	
	public DefaultConstructorCall()  // it should not contain return type like void
	{
		System.out.println("Hi i am default constructor");
	}

}
