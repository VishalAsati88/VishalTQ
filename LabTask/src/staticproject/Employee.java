package staticproject;

public class Employee 
{   
    private int id;
    private String name;
    private double salary;
    private static int count=101;
    
    Employee()
    {
    	id=count;
    	count++;
    	//System.out.println(count);
    	
    }
    
    Employee(String name,double salary)
    {
       this();
       this.name=name;
       this.salary=salary;
    }
    
    public void showData()
    {
    	System.out.println("ID is- "+id+ " Name is- "+name+ " Salary is- "+salary);
    }
    
    
	public static void main(String[] args) 
	{
      Employee obj1=new Employee("vishal",20000);
      obj1.showData();
      
      Employee obj2=new Employee("sagar",30000);
      obj2.showData();
      
      Employee obj3=new Employee("akash",40000);
      obj3.showData();
 
	}

}
