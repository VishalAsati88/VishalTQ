package labtask;

import java.util.Scanner;

public class Ass7 
{

	public static void main(String[] args) 
	{   
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int num=sc.nextInt();
		int sum=1;
		while(num>0)
		{
		int digit=num%10;
		sum=sum*digit;
		num=num/10;
		
			
			
		}	
		System.out.println(sum);	
		
		
		

	}

}
