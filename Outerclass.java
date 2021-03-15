abstract class Anonymous
{
	 abstract void methodOuter();
	 abstract void method2();
}
    class Outerclass
    {
       public static void main(String[] args)
       {
    	   Anonymous o=new Anonymous()
    	   {
    		   void method2()
    		   {
    			   System.out.print("Hey ");
    		   }
    		   void methodOuter()
    		   {
    			   System.out.println("people!!");
    		   } 
    	   };
    		      o.method2();
    		      o.methodOuter();
       }
    }
