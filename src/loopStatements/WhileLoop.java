package loopStatements;

public class WhileLoop {

	public static void main(String[] args)
	{
		// write table of 21 using while loop
		
		int i=21;
		while (i<211)
		{
			System.out.println(i);
			i=i+21;
		}
		System.out.println("===============");
		
		int sum=0;
		for(int j=1;j<=10;j=j+1)
		{
			sum +=j;
		}
		System.out.println(sum);

	}

}
