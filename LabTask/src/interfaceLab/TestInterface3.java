package interfaceLab;

import interfaceclasses.Showable;

public class TestInterface3 implements Showable 
{

	//@Override
	public void print() 
	{
		System.out.println("print the file");
		
	}

	//@Override
	public void show() 
	{
		System.out.println("show the file");
		
	}
	public static void main(String[] args) 
	{
		TestInterface3 obj=new TestInterface3();
		obj.print();
		obj.show();
	}
  
}
