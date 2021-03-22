class State
{
	void display1()
	{
		System.out.println("Language spoken: ");
	}
}
class Gujarat extends State
{
	void display2()
	{
		System.out.println("Gujarati");
	}
}
class Rajasthan extends State
{
	void display()
	{
		System.out.println("Rajasthani");
	}

	public static void main(String[] args)
	{
		Gujarat g=new Gujarat();
		g.display1();
		g.display2();

		Rajasthan r=new Rajasthan();
		r.display1();
		r.display3();
	}
}





