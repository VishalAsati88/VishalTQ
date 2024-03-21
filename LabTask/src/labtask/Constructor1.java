package labtask;

public class Constructor1 
{
	private long accountNo;
	private String customerName;
	
	
	Constructor1(long a,String c)
	{
		accountNo=a;
		customerName=c;
		
	}
	public void show()
	{
		System.out.println(accountNo+","+customerName);
		
	}

	public static void main(String[] args) 
	{
		Constructor1 obj=new Constructor1(254687,"Vishal");
		obj.show();
		obj.show();
		obj.show();

	}

}
