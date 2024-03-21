package arrayproject;

import java.util.Arrays;

//Array[]={12,35,21,54,22}
//Sorting the Array {12,21,22,35,54}
//Second_Largest_Element find
       
public class Second_Largest_Element {

	public static void main(String[] args) {
		
		int array[]={12,35,21,54,22};
		
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));
		
		System.out.println("Second Largest Number is "+array[array.length-2]);
		System.out.println("First Largest Number is "+array[array.length-1]);
		System.out.println("Smallest Number is "+array[array.length-5]);
		

	}

}
