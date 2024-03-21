package test;

import java.util.Arrays;

public class Occurence {
	
	public static void Occurence(int arr[])
	{
		int count=1;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
				}
			}System.out.println(arr[i]+"   "+count);
			
		}
		
	}
	

	public static void main(String[] args) {
		int arr[]={32,65,57,95,65,24,47};
		System.out.println(Arrays.toString(arr));
		Occurence(arr);
		

	}

}
