
public class Division
{
	public static void main(String[] args)
	{
		try        // Unchecked Exception
		{
			int a=100, b=0, c;
			c=a/b;
			System.out.println(c);
		}
		catch(Exception e)
		{
			System.out.println(e);
			System.out.println("Display");
		}
		finally
		{
			System.out.println("YOU HAVE TO PRINT THIS");
		}
		

	}

}
