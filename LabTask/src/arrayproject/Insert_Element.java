package arrayproject;

//a[2]={34,67,23}
//location=1
//a[2+1]={34,100,67,23}

import java.util.Arrays;
import java.util.Scanner;

public class Insert_Element {

	public static void main(String[] args) {
		
		int size,location,element;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Arrays Length ");
		
		size=sc.nextInt();
		int a[]=new int[size+1];
		for(int i=0;i<size;i++)
		{
			System.out.println("Enter array Elements");     //for Input Elements
			a[i]=sc.nextInt();
		}
		System.out.println("Enter Array Location");
		location=sc.nextInt();
		System.out.println("Enter New Element");
		element=sc.nextInt();
	
		for(int i=size;i>location;i--)
		{
			a[i]=a[i-1];                              //for Spacing
		}
		a[location]=element;
		size++;
		
		for(int i=0;i<size;i++)
		{
			System.out.print(a[i]+" ");                //for Printing
		}
		
	}

}
