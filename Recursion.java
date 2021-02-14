
public class Recursion 
{
	static int a=0,b=1,c;
	
	void fibonacci(int i)
	{
		if(i>=1)
		{
		c=a+b;
		System.out.print(" "+c);
		a=b;
		b=c;
	 fibonacci(i-1);
		}
	}

	public static void main(String[] args) 
	{
		System.out.print(a+ " " +b);
		Recursion ob=new Recursion();
		ob.fibonacci(15);
		

	}

}
