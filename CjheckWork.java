package MyPackage;

public class DataMembers {  // this class is in a package named MyPackage.
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











import MyPackage.DataMembers;
class SubDataMembers extends DataMembers  // SubDataMembers is a subclass of superclass DataMembers which is in other package.
{
	void printMembers()
	  {
		System.out.println("Private "+a);
		System.out.println("Default "+b);
		System.out.println("Protected "+c);
		System.out.println("Public "+d);
		
	  }
}
public class SuperSub // this class is in default package.
{
	public static void main(String[] args)
	{
		
	}
}	
