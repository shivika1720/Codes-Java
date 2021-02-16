
class Shape 
{
     double d; 
     Shape(double d)
     {
    	 this.d=d;
     }

     double area()
    {
         return(d*d);

    }

}
class Triangle extends Shape
{
	  double h;
	  Triangle(double d, double h)
	  {
		  
		 super (d);
		 this.h=h;
	  }
	  
	  double area()
	  {
		  return(0.5*d*h);
		  
	  }
}

public class InheritOverride
{
	 public static void main(String[] args)
	 {
		 
		 Triangle t=new Triangle(20,10);
		 System.out.println("Area of trianglr is: "+t.area());
	 }
}