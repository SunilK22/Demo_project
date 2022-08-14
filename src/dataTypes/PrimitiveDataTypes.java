package dataTypes;

public class PrimitiveDataTypes {

	public static void main(String[] args) 
	{
	// A. Numeric+Non Decimal: byte short int long
		/*I want to store number(non decimal)
		 * 1.use of byte*/
		
		System.out.println("======Store the age by using byte======");
		byte Age;                                 // Variable declaration
		Age=25;                                  // Variable initialization  
		System.out.println("My age is "+Age);   // Usage
	//=====================================================================
		
		System.out.println("======Store the height by using short======");	
		short Height;                                         // Variable declaration
		Height=6;                                            // Variable initialization
		System.out.println("My height is "+Height +"ft");   // Usage
	//=====================================================================
		System.out.println("======Store the distance by using int======");
		
		int Dist;                                            // Variable declaration
		Dist=292;                                           // Variable initialization
		System.out.println("My weight is "+Dist + "KM");   // Usage
	//=====================================================================
		System.out.println("======Store the area of home by using long======");
		
		long Area;                                                     // Variable declaration
		Area=1200;                                                    // Variable initialization
	    System.out.println("The area of home is "+Area +"SqMeter");  // Usage
	//---------------------------------------------------------------------------------
			/* B. Numeric + Decimal: float double
			 * while initialization--> variable must ends with f
			 * I want to store a decimal number*/
		System.out.println("======Store the Milege of my bike by using float======");
		
		float Milege;                                                    // Variable declaration
		Milege=40.3456f;                                                // Variable initialization
		System.out.println("the milege of my bike is "+Milege +"KM");  // Usage
	//=====================================================================
		System.out.println("======Store the Weight by using double======");
		
		double Weight;                                        // Variable declaration
		Weight=69.2314567;                                   // Variable initialization
		System.out.println("My weight is "+Weight +"Kg");   // Usage
	//---------------------------------------------------------------------------------
		/* C. Character: char
		 *  while initialization--> variable must be in single colon('')
		 * I want to store grade=> A B C*/
		System.out.println("======Store the grade by using char datatype======");
		
		char Grade;                                               // Variable declaration
		Grade='A';                                               // Variable initialization
		System.out.println("My graduation grade is "+ Grade);   // Usage
	//---------------------------------------------------------------------------------
				/* D. Conditional: boolean
				 * I want to store result-->pass/fail
				 * pass=>true  fail=>false*/
		System.out.println("======Store the result by using boolean datatype======");
		
		boolean Result;                                  // Variable declaration
		Result=true;                                    // Variable initialization
		System.out.println("My result is "+ Result);   // Usage
	}

}
