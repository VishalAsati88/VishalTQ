package containment;

public class MyDate 
{
	private int dd,mm,yy;
	
	public MyDate()   //default Constructor
	{
		//System.out.println("In default constructor of MyDate() ");
		dd=mm=yy=0;
	}
	MyDate(int dd,int mm,int yy)       //parametric Constructor
	{
		//System.out.println("In parametric Constructor of MyDate() ");
		this.dd=dd;
		this.mm=mm;
		this.yy=yy;
	}
	public void showDate()
	{
		System.out.println(dd+"/"+mm+"/"+yy);
	}

	public static void main(String[] args) 
	{
	   MyDate obj=new MyDate();
	   obj.showDate();
	   
	   MyDate obj1=new MyDate(9,2,2024);
	   obj1.showDate();

	}

}
