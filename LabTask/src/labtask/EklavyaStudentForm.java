package labtask;

import java.util.Scanner;

public class EklavyaStudentForm 
{  
	String Studentname,Fathername,Mothername,Email,Graduation;
	long Aadharnum,Mobnum,yearofpassing;
	double Highschper,Highersecper,Graduationper;
	
	public void setData();
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter studentName");
		Studentname=sc.next();
		System.out.println("Enter FatherName");
		Fathername=sc.next();
		System.out.println("Enter MotherName");
		Mothername=sc.next();
		System.out.println("Enter Email");
		Email=sc.next();
		System.out.println("Aadharnum");
		Aadharnum=sc.nextLong();
		System.out.println("Mobilenum");
		Mobnum=sc.nextLong();
		System.out.println("10th percentage");
		Highschper=sc.nextDouble();
		System.out.println("Year of Passing");
		yearofpassing=sc.nextLong();
		System.out.println("12th percentage");
		Highersecper=sc.nextLong("Year of Passing");
		System.out.println();
		
		
		
	}
	
	
	

	public static void main(String[] args) 
	{
	 

	}

}
