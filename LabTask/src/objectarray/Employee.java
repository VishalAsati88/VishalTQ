package objectarray;

import java.util.Arrays;



public class Employee {

	int empid;
	String name;
	double salary;
	JoiningDate date;
	
	
	
	public Employee()
	{
	    	empid=0;
	    	name="";
	    	salary=0;
	    	date=new JoiningDate();
	}
	public Employee(int empid,String name,double salary, JoiningDate date)
	{
		this.empid=empid;
		this.name=name;
		this.salary=salary;
		this.date=date;
		
	}
	public String toString()
	{
		return empid+" "+name+" "+salary+" "+date;
	}
	
	public static void main(String[] args) 
	{
	Employee earr[]=new Employee[5];
	
	
	
	
	//int j1[]={5,2,2023};
	earr[0]=new Employee(101,"Vishal",30000,new JoiningDate(02,04,1996));
	//int j2[]={5,2,2023};
	earr[1]=new Employee(102,"Vivek",40000,new JoiningDate(01,03,1997));
	//int j3[]={11,6,2021};
	earr[2]=new Employee(103,"Vinay",40000,new JoiningDate(03,06,1998));
	//int j4[]={04,11,2010};
	earr[3]=new Employee(104,"Vikas",60000,new JoiningDate(02,05,1999));
	//int j5[]={17,2,2004};
	earr[4]=new Employee(105,"Vaibhav",70000,new JoiningDate(02,04,1996));

	for(Employee e:earr)
	{
		System.out.println(e);
	}
	System.out.println(".........");
	
	for (Employee e:earr)
	{
		if(e.salary>=40000)
		{
			System.out.println(e);
		}
	}
	System.out.println("................");
	
	
	for(int i=0;i<earr.length;i++)
	{
		int count=0;
		for(int j=i+1;j<earr.length;j++)
		{
			if(earr[i].salary==earr[j].salary)
				count++;
		}
		if(count>1)
			System.out.println(earr[i].name+" "+earr[i].salary);
	}
		
				
		
	
	
	
	
	


	

	
	
		for(int i=0;i<earr.length-1;i++)
		{
			
			for(int j=i+1;j<earr.length-1;j++)
			{
				if(earr[i].date==earr[j].date)
					
					{
					System.out.println("Same JoiningDate");
					System.out.println(earr[i].date);
					System.out.println(earr[i].date);
					}
			}
		}
	}
}