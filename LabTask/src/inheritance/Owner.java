package inheritance;

public class Owner 
{

	int id;
	String name;
	long mobileNo;
	
	public Owner()
	{
		
	}
	public Owner(int id,String name,long mobileNo)
	{
		this.id=id;
		this.name=name;
		this.mobileNo=mobileNo;
	}
	public String toString()
	{
		return "Owner id"+id+"Owner name"+name+"Mobile No"+mobileNo;
	}
	public static void main(String[] args) 
	{
		Owner obj=new Owner();
		Owner obj1=new Owner(1,"Vishal",25469874);
		System.out.println(obj1);

	}

}
