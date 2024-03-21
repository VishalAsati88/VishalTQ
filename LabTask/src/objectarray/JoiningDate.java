package objectarray;

public class JoiningDate {
	
public int dd,mm,yy;
	
	JoiningDate()
	{
		
	}
	JoiningDate(int dd,int mm,int yy)
	{
		this.dd=dd;
		this.mm=mm;
		this.yy=yy;
	}
    public String toString()
    {
    	return dd+" "+mm+" "+yy;
    	
    }

	public static void main(String[] args) 
	{
		JoiningDate obj=new JoiningDate(04,02,1996);
		System.out.println(obj);

	}

}
