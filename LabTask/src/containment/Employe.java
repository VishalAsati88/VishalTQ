package containment;

public class Employe 
{
	private int id;
	private String name;
	private double salary;
	private Dept dept;
	private MyDate mydate;
	
	Employe()           //Default
	{
		id=0;
		name=" ";
		salary=0;
		dept=new Dept();
		mydate=new MyDate();
	}
	
	Employe(int id,String name,double salary,Dept dept,MyDate mydate)     //parametric
	{  
		this.id=id;
		this.name=name;
		this.salary=salary;
		this.dept=dept;
		this.mydate=mydate;
	}
	public void showData()
	{
		System.out.println("EmpId "+id);
		System.out.println("Empname "+name); 
		System.out.println("EmpSalary "+salary);
		mydate.showDate();
		dept.showData();
		System.out.println("------------------------------");
		
	}
	
	

	public static void main(String[] args) 
	{
	   Employe e1=new Employe();
	   e1.showData();
	   MyDate d1=new MyDate(9,2,2024);
	   
	   Employe e2=new Employe(201,"Vishal",20000,new Dept(101,"IT"),new MyDate(9,2,2024));
	   
	   e2.showData();
	   
	   
	 

	}

}
