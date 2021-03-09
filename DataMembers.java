package MyPackage;

public class DataMembers
{
	   private int a=10;
	   int b=20;
	   protected int c=17;
	   public int d=14;
}
class SubData extends DataMembers
{
	   void printMembers()
	   {
		  System.out.println("Private "+a);
			System.out.println("Default "+b);
			System.out.println("Protected "+c);
			System.out.println("Public "+d);
			
	   }
public static void main(String[] args)
	  {
		 new SubData().printMembers();
	  }
  }
