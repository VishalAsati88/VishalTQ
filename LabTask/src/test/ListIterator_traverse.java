package test;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListIterator_traverse {
	
	
	public static void main(String args[]){
	LinkedList <String> list1=new LinkedList<String> ();
	list1.add("Vishal");
	list1.add("Dharmendra");
	list1.add("Amit");
	list1.add("Sumit");
	list1.add("Ashish");

	ListIterator <String> itr1= list1.listIterator();
	while(itr1.hasNext())
	{
	System.out.println(itr1.next());
	}
	System.out.println("Using ListIterator in reverse");
	ListIterator <String> itr= list1.listIterator();
	while(itr.hasPrevious())
	{
	System.out.println(itr.previous());
	}
	}

}
