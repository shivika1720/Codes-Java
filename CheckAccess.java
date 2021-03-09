public class CheckAccess
{
   private int a=10;   // All the modifiers are accessible within a class.
   int b=20;
   protected int c=17;
   public int d=14;

 void printMembers()
  {
	System.out.println("Private "+a);
	System.out.println("Default "+b);
	System.out.println("Protected "+c);
	System.out.println("Public "+d);
	
  }
 public static void main(String[] args)
  {
	 new CheckAccess().printMembers();
  }
 }
