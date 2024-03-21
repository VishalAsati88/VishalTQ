package containment;

public class Employee 
{
	private int eid;
	private String name;
	private double sal;
	private MyDate doj;
	
	public Employee()        //Default
	{
		eid=0;
		name="";
		sal=0;
		doj=new MyDate();
	}
	
    Employee(int eid,String name,double sal,MyDate doj)     //Parametric
    {
    	this.eid=eid;
    	this.name=name;
    	this.sal=sal;
    	this.doj=doj;
    }
    
    public void showData()
    {
    	System.out.println(eid+" "+name+" "+sal);
    	doj.showDate();
    	System.out.println("-------------------------");
    }
	public static void main(String[] args) 
	{
		Employee e1=new Employee();
		e1.showData();
		MyDate d1=new MyDate(9,2,2024);
		
		Employee e2=new Employee(101,"pratik",56000,new MyDate(9,2,2024));
		e2.showData();
	}

}
