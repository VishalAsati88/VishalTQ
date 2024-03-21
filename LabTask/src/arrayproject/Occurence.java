//Qno-6  Show Occurence(Frequency of each elements)
//Most Repeated   //Unique    //Duplicate


package arrayproject;

import java.util.Arrays;

public class Occurence {

	static int max,number;
	
	static void show(int arr[])
	{
		for (int i=0;i<arr.length;i++)
		{
			boolean flag=false;
			for(int k=i-1;k>=0;k--)
			{
				if(arr[i]==arr[k])
				{
					flag=true;
					break;
				}
			}
			if(!flag)
			{
				int count=1;
				
				for(int j=i+1;j<arr.length;j++)
				{
					if(arr[i]==arr[j])
						count++;
				}
				System.out.println(arr[i]+"-"+count);
				}
		}//System.out.println("Most rep num is "+number);
	}
	public static void main(String[] args) 
	{
		int arr[]={10,20,20,60,30,20};
		
		System.out.println(Arrays.toString(arr));
		Occurence.show(arr);
		

	}

}
