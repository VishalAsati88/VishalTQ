//Right rotate array by one position eg{4,5,6,7} after right rotate
//will become {7,4,5,6}


package arrayproject;

import java.util.Arrays;

public class Rotate {
	
	public static void rotatenumber(int a[])
	{
		int lastNumber=a[3];
		
		for(int i=3;i>0;i--)
		{
			a[i]=a[i-1];
		}
		a[0]=lastNumber;
		System.out.println("After Rotating");
		System.out.println(Arrays.toString(a));	
	}
	
	
	
	

	public static void main(String args[])
	{
		int arr[]={21,25,34,98};
		System.out.println("Before Roatating");
		System.out.println(Arrays.toString(arr));
		rotatenumber(arr);	
		
	}
}