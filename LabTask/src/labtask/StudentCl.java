package labtask;

import java.util.Scanner;

public class StudentCl 
{ 
	int classname,total,hindi,english,science,polity,cs,sum=0;
	String studentname,stuaddress,grade;
	double per;
	
	
	public void setData()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Classname");
		classname=sc.nextInt();
		System.out.println("Enter studentname");
		studentname=sc.next();
		System.out.println("Enter Subname");
		System.out.println("hindi");
		hindi=sc.nextInt();
		System.out.println("english");
		english=sc.nextInt();
		System.out.println("science");
		science=sc.nextInt();
		System.out.println("polity");
		polity=sc.nextInt();
		System.out.println("cs");
		cs=sc.nextInt();
		
		
		
		
	}
	public void per()
	{
		sum=(hindi+english+science+polity+cs);
	    per=(sum/5);
	}
	public void showData()
	{
		
        System.out.println("Percentage"+per);
		
	}
	public void grades()
	{
		if (per>80 && per<100)
			System.out.println("Grade A");
		else if (per>70 && per<80)
			System.out.println("Grade B");
		else if (per>70 && per<60)
			System.out.println("Grade C");
		else if (per>60 && per<50)
			System.out.println("Grade D");
		else
			System.out.println("No Grade");
	}
		
	public static void main(String args[]) 
	{
		StudentCl obj=new StudentCl ();
		obj.setData();
		obj.per();
		obj.showData();
		obj.grades();
		
		

	}

}
