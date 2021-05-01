class A
{
  public void show(String txt)
  {
	//System.out.print ("Name- Shivika Kejriwal Roll No. R171219048 ");  
    System.out.print (" I LOVE UPES "+txt);
    try
    {
      Thread.sleep(1000);
    }
    catch(InterruptedException e)
    {
      e.printStackTrace();
    }
    System.out.println (" I  LOVE UPES..... ");
  }
}

class B extends Thread
{
  String txt;
  A abc;
  B (A op,String s)
  {
    abc = op;
    txt = s;
    start();
  }
  public void result()
  {
    synchronized(abc)      
    {
      abc.show(txt);
    }
  }
}

public class MultiThreading
{
  public static void main (String[] args)
  {
    A a = new A();
    B b = new B(a, " I ");
    B b1= new B (a," LOVE ");
    B b2 = new B(a, " UPES ");
    System.out.print ("Name- Shivika Kejriwal Roll No. R171219048 "+ "\n");
  }
}
