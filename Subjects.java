public class Subjects
{ 
		   final void finalmethod()
		   {
		      System.out.println("A final method cannot be overridden.");
		   }  
		
			     
		class Core extends Subjects
		{  
		   public void main(String args[])
		   {  
		      Subjects obj= new Subjects();  
		      obj.finalmethod();  
		   }  
		}
	
}
