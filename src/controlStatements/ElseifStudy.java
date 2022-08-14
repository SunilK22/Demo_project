package controlStatements;

public class ElseifStudy {

	public static void main(String[] args)
	{
		float weight=160.35f;
		if(weight<=45 & weight>0)
		{
			System.out.println("You are underweight");
		}
		else if(weight>45 & weight<=75)
		{
			System.out.println("You have normal weight");
		}
		else if(weight>75 & weight<=95)
		{
			System.out.println("You have overweight");
		}
		else
		{
			System.out.println("You have obesity");
		}

	}

}
