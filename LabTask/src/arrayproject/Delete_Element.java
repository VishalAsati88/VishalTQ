package arrayproject;

import java.util.Arrays;

public class Delete_Element {

	public static void main(String[] args) {
       
		int firstArray[]={1,2,3,4,5};
		System.out.println(Arrays.toString(firstArray));
		int index=2;
		
		int newArray[]=new int [firstArray.length-1];
		
		for(int i=0,k=0;i<firstArray.length;i++)
		{
			if(i==index)
			{
				continue;
			}
			newArray[k++]=firstArray[i];	
		}
		System.out.println(Arrays.toString(newArray));
		
		

		

	}

}
