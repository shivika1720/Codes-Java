import java.util.Scanner;
class YoungerAgeException extends RuntimeException // inheriting properties from parent exception class
{
	YoungerAgeException(String msg)  // parameterized constructor
	{
	   super(msg);
	}
}
public class Voting
{
   public static void main(String[] args)
	{
	
	   Scanner s=new Scanner(System.in);        // taking input from user
	   System.out.println("Enter the age: ");
	   int age=s.nextInt();  
		  
	   try
	   {
		  if(age<18)
		  {
			  throw new YoungerAgeException("You are not eligible to vote."); //user creating object of exception class
		  }
		  else
		  {
			  System.out.println("You can vote.");
		  }
	   }
	   catch(Exception e)
	   {
		  e.printStackTrace();
	   }
		 System.out.println("Exception handled");

	}

}
