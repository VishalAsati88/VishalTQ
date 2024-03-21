package arrayproject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Convert_ArrayToArrayList {
	
	

	public static void main(String[] args) {
		
		//Method 1
		
		String[] s={"Vishal","Kunal","Kushal","Jindal"};
		
		ArrayList <String> list=new ArrayList<String>(Arrays.asList(s));
		System.out.println(list);
		
		list.add("Vaishali");
		list.add("Vinay");
		System.out.println(list);
		System.out.println("----------------------");
		
		
		//Method 2
		
		ArrayList <String> list1=new ArrayList<>();
		
		Collections.addAll(list1, s);
		System.out.println(list1);
		list1.add("Sheetal");
		list1.add("Nishant");
		
		System.out.println(list1);
		System.out.println("............");
		
		
		//Method3
		
		ArrayList<String> list2=new ArrayList <>();
		for (String str : s)
            list2.add(str);
 
        System.out.println(list2);
		
		
		
		
		
		

	}

}
