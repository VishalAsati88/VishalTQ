package package2;

import package1.Demo;

public class CheckWithInheri extends Demo
{

	public static void main(String[] args) 
	{
		Demo d1=new Demo();
		d1.show();     //public
		
		CheckWithInheri obj1=new CheckWithInheri();
		obj1.present();    //protected
		obj1.show();       //public is Also accessible in inherit class 

	}

}
