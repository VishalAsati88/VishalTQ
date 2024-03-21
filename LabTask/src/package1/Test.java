package package1;

public class Test 
{

	public static void main(String[] args) 
	{
		Demo d1=new Demo();
		d1.show();     //public
       // d1.showData();    //private 
		d1.present();       //protected
		d1.Data();          //Default
	}

}
