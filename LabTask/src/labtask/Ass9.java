package labtask;

import java.util.Scanner;

public class Ass9 
{
   public void countDigit()
   {
	   int n,count=0;
	   System.out.println("Enter number ");
	   Scanner r=new Scanner(System.in);
	   n=r.nextInt();
	   while(n>0)
	   {
		   n=n/10;
		   count++;
		   
	   }
	   System.out.print(count+" ");
   }
   public static void main(String args[])
   {
	   Ass9 obj=new Ass9();
	   obj.countDigit();
   }
   
}
