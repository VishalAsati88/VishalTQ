package labtask;

import java.util.Scanner;

public class Ass8 
{ 
	public void factorialFind()
	{
		int n,fact=1,i;
		System.out.println("Enter Number ");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			fact=fact*i;
			System.out.println(fact+" ");
		}
	}

	public static void main(String[] args) 
	{
		Ass8 obj=new Ass8();
		obj.factorialFind();

	}

}
