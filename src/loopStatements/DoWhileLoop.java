package loopStatements;

public class DoWhileLoop {

	public static void main(String[] args)
	{
		// print table of 17 in reverse order
		int a=170;
		do
		{
			System.out.println(a);
			a=a-17;
		
		}while (a>16);
		
		System.out.println("===========");

		int b=17;
		do
		{
			System.out.println(b);
			b=b+17;
		}while (b<171);
	}

}
