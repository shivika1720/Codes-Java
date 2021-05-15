
public class UseFinally {

	public static void main(String[] args)
	{
		try        // Unchecked Exception
		{
			int a=100, b=0, c;
			c=a/b;
			System.out.println(c);
		}
		catch(AssertionError e)
		{
			System.out.println(e);
			System.out.println("Display");
		}
		finally   // Finally block will always execute.
		{
			System.out.println("YOU HAVE TO PRINT THIS");
		}
		

	}

}

