package package1;

public class Demo 
{

	public int a=20;
	private int b=30;
	protected int c=40;
	int d=50;
	
	
	public void show()
	{
		System.out.println("a value is  "+a);
		System.out.println("Its Scope is more than other access modifiers means Everywhere");
	}
	
	private void showData()
	{
		System.out.println("b value is  "+b);
		System.out.println("Its Scope is within Class ");
	}
	
	protected void present()
	{
		System.out.println("c value is  "+c);
		System.out.println("Its scope is with Inhertance ");
	}
	
	void Data()
	{
		System.out.println("D value is  "+d);
		System.out.println("Its scope is within package");
	}
	
	
	
	public static void main(String[] args) 
	{
		
		Demo d1=new Demo();
		
		
		d1.show();
		
		d1.showData();
		d1.present();
		d1.Data();
	
		
	
	}

}
