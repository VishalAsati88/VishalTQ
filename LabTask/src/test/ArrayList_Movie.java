package test;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList_Movie {
	
        public static void AmitabhMovie(ArrayList <Movie> ar)
        {
        	String str="Amitabh bacchan";
        	int count=1;
        	for(Movie m: ar)
        	{
        		if(m.getActor().getName().equals(str))
        		{
        			count++;
        		}System.out.println(m.getActor().getName()+" has acted in "+count+ " movies ");
        		
        	}
        	
        }
	
	

		public static void main (String args[])
		{

		ArrayList <Movie> ar =new ArrayList<>();
		ar.add(new Movie(101,"Rajneeti",new Actor(11,"Ranveer Kapoor")));
		ar.add(new Movie(105,"Baghwan",new Actor(17,"Amitabh bacchan")));
		ar.add(new Movie(108,"YjHD",new Actor(15,"Ranveer Kapoor")));
		ar.add(new Movie(111,"kalia",new Actor(16,"Amitabh bacchan")));
		ar.add(new Movie(113,"Veer",new Actor(20,"Salman Khan")));
		ar.add(new Movie(104,"Farzi",new Actor(1,"shahid Kapoor")));
		
		AmitabhMovie(ar);



		}



}
