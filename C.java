class A
{
	void showA()
	{
		System.out.printn("a");
	}
}
class B extends A
{
	void showB()
	{
		System.out.println("b");
	}
}
class c extends B
{
	void showC()
	{
		System.out.println("c");
	}
      public static void main()
      {
	      C ob=new C();
	      ob.showA();
	      ob.showB();
	      ob.showC();
      }
}
