package controlStatements;

public class NestedIfElseStudy {

	public static void main(String[] args) 
	{
		// login page 
        String UserName="XYZ";
        int Password=1234;
        
        if (UserName=="XYZ")
        {
        	System.out.println("Correct UserName, Enter Password");
        	if (Password==124)
        	{
        		System.out.println("Login Successful");
        	
        	}
        	else
        	{
        		System.out.println("Wrong password, Please enter correct password");
        	}
        }
        else
        	{
        		System.out.println("Wrong UserName, Please correct UserName");
        	}
        }

	}


