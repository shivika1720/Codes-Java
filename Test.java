import java.io.FileInputStream;
public class Test
  {

	public static void main(String[] args) 
		{
			try     // Checked Exception
			{
			   FileInputStream fis=new FileInputStream("d: /abc.txt");
			}
		       catch (Exception e)
		       {
			   System.out.println(e);
			   System.out.println("Display");
	     	       }
			
		}
	
   }
