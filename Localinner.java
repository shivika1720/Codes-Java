public class Localinner 
 {
		 void create()
		 {
			 System.out.println("This is march goin'");
			 
		      class English   // class English declared inside method create.
      		      {
		    	  void expand()
		    	  {
		    	      System.out.println("This is march goin'");
		    	  }
		      }
		         English en=new English();
		         en.expand();
		  }
 
        public void main(String[] args)
     {
        	Localinner lo =new Localinner();
    	    lo.create();
    	 
     }
  }
