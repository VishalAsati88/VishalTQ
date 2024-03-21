package arrayproject;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayReverseOrder 
{

	public static void main(String[] args) 
	{
	   int a[]=new int[6];
	   Scanner sc=new Scanner(System.in);
       for(int i=0;i<a.length;i++)
       {
    	   System.out.println("Enter Elements");
    	   a[i]=sc.nextInt(); 
       }
    	System.out.println(Arrays.toString(a));
    	System.out.println("Array in Reverse Order");
    	for(int i=a.length-1;i>=0;i--)
    	{
    		System.out.print(a[i]+" ");
    	}
    	   
	}

}
