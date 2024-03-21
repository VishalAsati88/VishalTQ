package interfaceclasses;

import interfaceLab.Bank;

public class TestInterface2 
{
   public static void main(String[] args) 
   {
	Bank b=new SBI();
	System.out.println(b.rateOfInterest());
	
	Bank c=new PNB();
	System.out.println(c.rateOfInterest());
   }
}
