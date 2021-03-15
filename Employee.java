public class Employee
{
    final int Salary;
    Employee(int i)
    
    {
    	Salary=i;
    }
    
    void description()
     {
       System.out.println("Salary of the employee is "+Salary);
     }
    
	public static void main(String[] args)
	
	{
		Employee ob=new Employee(70000);
		ob.description();

	}

}
