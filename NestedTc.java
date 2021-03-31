public class NestedTc
{
	public static void main(String[] args)
	{
	    try  // Nested try block
	     {
                   System.out.println("Nested try-catch");

                   try
                 {
                    int a = 20, b = 0, c;
                    c = a/b;
                    System.out.println(c);
                 }
            
		
		    catch(ArithmeticException e)
                {
                    System.out.println("Division by 0 is not defined");
                }

                    try
               {
                    int arr[] = {1,2,3,4,5};
                    System.out.println(arr[10]);
               }
		
                   catch(ArrayIndexOutOfBoundsException e)
               {
                   System.out.println("Index doesnot exists");
               }
	   }
		
           catch(Exception e)
            {
                    System.out.println("Exception occured");
            }
		  
	}

 }  
