class A     // Parent class
{
	 void showA()
	{
	      System.out.printn("a");
	}
}
class B extends A     // Single Inheritance
{
	 void showB()
	{
	      System.out.println("b");
	}
}
class c extends B   // Multiple Inheritance
{
	 void showC()
	{
	      System.out.println("c");
	}
      public static void main()
      {
	      C ob=new C();   // with object of class C, we can call all the methods.
	      ob.showA();
	      ob.showB();
	      ob.showC();
      }
}

