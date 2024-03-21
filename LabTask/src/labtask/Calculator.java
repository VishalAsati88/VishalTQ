package labtask;

import java.util.Scanner;

public class Calculator 
{
	

	public static void main(String[] args) 
	{
		
		
			int num1,num2,res=0;
			System.out.println("Enter two numbers ");
			Scanner sc=new Scanner(System.in);
			num1=sc.nextInt();
			num2=sc.nextInt();
			System.out.println("Enter your choice\n1.Addition\n2.substraction\n3.multiplication\n4.division\n ");
			int num=sc.nextInt();
			
			switch(num)
			
			
			{
			case 1:
			       res=num1+num2;
			       System.out.println("Addition is "+res);
			       break;
			case 2:
				   res=num1-num2;
				   System.out.println("Sub is "+res);
				   break;
			case 3:
				   res=num1*num2;
				   System.out.println("multi is "+res);
			       break;
			case 4: 
				   res=num1/num2;
				   System.out.println("Div is "+res);
				   break;
			default:
				   System.out.println("invalid");
		
			       
			       
			
			
			
			
			
			
			
			}
		    
			
			
			
			
		}

	}

