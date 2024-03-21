package labtask;

import java.util.Scanner;

public class Fullform 
{   
	public void fullf()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter abbreviation ");
		String abbre=sc.next();
		
		switch(abbre)
		{
		case "Wifi":
			System.out.println("Wireless fiedility");
			break;
		case "Ram" :
			System.out.println("Random Access Memory");
			break;
		case "Cpu" :
			System.out.println("Central Processing Unit");
			break;
		case "Cdac" :
			System.out.println("Center for Development of Advance Computing");
			break;
		case "IP" :
			System.out.println("Internet Protocol");
			break;
		default :
			System.out.println("Invalid");
		}
		
		
	}

	public static void main(String[] args) 
	{
		Fullform obj=new Fullform();
		obj.fullf();

	}

}
