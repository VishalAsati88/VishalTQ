package arrayproject;

import java.util.ArrayList;

public class ConvertArrayList_Array {

	public static void main(String[] args) {
		
		// Method 1 (toArray Method- It is a Object class Method)
		
		ArrayList <String> str=new ArrayList <String> ();
		str.add("Vishal");
		str.add("Sanket");
		str.add("Sagar");
		str.add("Nishant");
		str.add("Dharmendra");
		
		Object[] obj=str.toArray();
		for(Object o:obj)
		{
			System.out.print(o+",");
			
		}
		System.out.println();
		System.out.print(">>>>>.......");
		System.out.println();
		
		// Method 2 ()
		
		ArrayList<Integer> str1=new ArrayList<>();
		str1.add(40);
		str1.add(55);
		str1.add(12);
		str1.add(20);
		str1.add(45);
		
		Integer[]arr=new Integer[str1.size()];
		arr=str1.toArray(arr);
		
		for(Integer i : arr){
			System.out.print(i+",");
		}
		System.out.println();
		
		//Method 3 (get() Method )
		 ArrayList<Integer> str2 = new ArrayList<Integer>();
	        str2.add(10);
	        str2.add(20);
	        str2.add(30);
	        str2.add(40);
	 
	        Integer[] a = new Integer[str2.size()];
	 
	        // ArrayList to Array Conversion
	        for (int i = 0; i < str2.size(); i++)
	            a[i] = str2.get(i);
	 
	        for (Integer x : a){
	            System.out.print(x + " ");
	    }
		
		
		

	}

}
