package methods;

public class NonStaticMethodCall {

	public static void main(String[] args) 
	{
		//to call non static method from same class--> need to create object of a class
		// How to create object
		// ClassName ObjectName=new ClassName();
		NonStaticMethodCall ObjA=new NonStaticMethodCall();  // created object of a class
		// call--> non static method
		// ObjectName.MethodName();
		ObjA.methodA();  // calling non static method from same class
		
		/*---------------------------------------------------------------------------------*/
		// calling non static method from another class
		/*test1 ObjB=new test1(); //classname objectname=new classname();
		ObjB.methodB();*/
		
		test1 ab=new test1();
		ab.method4();
 
	}

	public void methodA()
	{
		System.out.println("Hi i am non static method fom same class");
	}
}
