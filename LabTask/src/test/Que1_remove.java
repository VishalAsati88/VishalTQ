package test;

import java.util.ArrayList;

public class Que1_remove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al=new ArrayList<String> () ;
		al.add("Sun");
		al.add("Mon");
		al.add("Sat");
		al.add("Sun");
		al.add("Mon");
		al.add("Sat");
		al.add("Sun");
		al.add("Sat");
		al.add("Sun");
		al.add("Mon");

		System.out.println(al);

		al.remove("Sun");
		al.remove("Mon");
		al.remove("Sat");
		al.remove("Mon");
		al.remove("Sat");
	    al.remove("Sun");
		al.remove("Sun");
		

		System.out.println(al);

	}

}
