public class MultipleCatch
{
	public static void main(String[] args)
	{
		try
        {
              int a = 20, b = 0, c;
               c = a/b;
               System.out.println(c);
        }
		catch(ArrayIndexOutOfBoundsException e)   // Multiple catch block
        {
              System.out.println("Index doesnot exists");
        }
		catch(ArithmeticException e)
        {
              System.out.println("Division by 0 is not defined");
        }
		
	}

}

