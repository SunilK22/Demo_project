package methods;

public class MathOperations {
	
	public static void Addition()
	{
		int X=25;
		int Y=10;
		int sum=X+Y;
		System.out.println("Sum of X and Y is "+sum);
	}
	
	public void Multiply()
	{
		int X=5;
		int Y=20;
		int multi=X*Y;
		System.out.println("Muliplication of X and Y is "+multi);
	}

	public static void main(String[] args)
	{
		System.out.println("-----------Static method call from same class----------------");
		Addition();
		System.out.println("-----------Non static method call from same class------------");
		MathOperations Mo=new MathOperations();
		Mo.Multiply();

	}

}
