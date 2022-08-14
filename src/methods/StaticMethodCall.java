package methods;

public class StaticMethodCall {

	public static void main(String[] args)
	{
		// How to call static method from same class
		// methodName();
		method1(); // Calling static regular method from same class
		/*------------------------------------------------------------*/
		
		// How to call static method from another class
		// classname.methodName();
		test1.method2();

	}

	public static void method1()
	{
		// Regular static method (complete)
		System.out.println("Hi i am static regular method from same class");
	}
}
