package labtask;

import java.util.Scanner;

public class PrintWord {

	public static void main(String[] args) 
	{
		int num;
		System.out.println("Enter num");
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        
        switch (num)
        {
        case 1:
        	System.out.println("One");
        	break;
        case 2:
        	System.out.println("Two");
        	break;
        case 3:
        	System.out.println("Three");
        	break;
        case 4:
        	System.out.println("four");
        	break;
        case 5:
        	System.out.println("five");
        	break;
        default:
        	System.out.println("Nothing");
        
      
        }
        
        
        
        
	}

}
