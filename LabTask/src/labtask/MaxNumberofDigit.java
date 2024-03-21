package labtask;

import java.util.Scanner;

public class MaxNumberofDigit 
{  
	
	public void number()
	{
		int digit=0,max=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter num");
		int num=sc.nextInt();
		
		for(int i=num;i>0;i=i/10)
		{
			digit=i%10;
			if (digit>max)
				max=digit;
			
			
		}
		System.out.println(max+" max number");
		
		
	}

	public static void main(String[] args) 
	{
		MaxNumberofDigit obj=new MaxNumberofDigit();
		obj.number();
		

	}

}
