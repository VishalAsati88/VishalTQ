package arrayproject;

import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array size");
		int size=sc.nextInt();
		int array[]=new int[size];
		
		for(int i=0;i<size;i++)
		{
			System.out.println("Enter the Elements");
			array[i]=sc.nextInt();
		}
		System.out.println("Printing the Elements");
		for(int i=0;i<size;i++)
		{
			System.out.print(array[i]+" ");
		}

	}

}
