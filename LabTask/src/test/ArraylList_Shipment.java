package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArraylList_Shipment {
	
	public static void print(ArrayList <Shipment> list){
		
		Iterator <Shipment> itr=list.iterator();
		while(itr.hasNext()){
			Shipment s=itr.next();
			System.out.println(s);
		}
	}
	
	

	public static void main(String args[])
	{
	ArrayList <Shipment> list =new ArrayList <> ();
	list.add(new Shipment(101,"Vishal",new Address(" Golden City","Damoh","MP"),new Mydate(17,3,1996)));
	list.add(new Shipment(108,"Sanket",new Address(" Beautiful City","Satara","MH"),new Mydate(14,3,1996)));
	list.add(new Shipment(101,"Nishant",new Address(" Sarthak City","Agra","UP"),new Mydate(11,3,1996)));
	list.add(new Shipment(102,"Kunal",new Address(" Pink City","Jaipur","Rajasthan"),new Mydate(20,3,1996)));
	list.add(new Shipment(101,"Dharmendra",new Address(" Smart City","Agra","UP"),new Mydate(21,3,1996)));
 
	System.out.println(list);
	System.out.println(">>>>>>>>>");
	
	print(list);
	
	Collections.sort(list,new SortByCities());
	System.out.println(">>>>>>>>>");
	print(list);
	
	Collections.sort(list,new SortById());
	System.out.println(">>>>>>>>>");
	print(list);

}
}
