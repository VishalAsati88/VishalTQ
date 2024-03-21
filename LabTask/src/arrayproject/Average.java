package arrayproject;

import java.util.Scanner;

public class Average 
{

	public static void main(String[] args) 
	{
		int n[]=new int[6]; int sum=0;int avg;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter elements");
		
		
		for(int i=0;i<n.length;i++)
		{
			n[i]=sc.nextInt();
		}
        System.out.println("elements are");
        for(int i=0;i<n.length;i++)
        {
        	System.out.print(n[i]+" ");
        }
        for(int i=0;i<n.length;i++)
        {
        	sum=sum+n[i];
        }
        avg=sum/6;
        System.out.println("\nAverrage"+avg+"\nSum"+sum);
	}
	

}
