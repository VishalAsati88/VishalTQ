package test;

import java.util.ArrayList;
import java.util.Collections;
public class Sort_ArrayList {
	
	public static void main(String[] args) {
		
	
	ArrayList <String> ar=new ArrayList<>();
	ar.add("Sarthak");
	ar.add("Aniket");
	ar.add("Nishant");
	ar.add("Sagar");
	ar.add("Sanket");
	ar.add("Vishal");

	System.out.println(ar);
	Collections.sort(ar);
	System.out.println(ar);
	Collections.reverse(ar);
	System.out.println("-------");
	System.out.println(ar);
	


}
}