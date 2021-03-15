class Outer
{
	int i;
	void show()
	{
		System.out.println("Show");
	}
	class Inner     // Member Class         
	{
		public void display()
		{
			System.out.println("Display");
		}
	
	}
}
public class InnerClass
{
	public static void main(String[] args)
	{
		Outer ob= new Outer();
		ob.show();
		
		Outer.Inner ob1= ob.new Inner();  // If inner class will be static, no need to create object.
		ob1.display();
		
		
	}
}
