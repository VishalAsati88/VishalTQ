package objectclass;
	
public class MyDate 
	{
		MyDate(int dd,int mm,int yy)
		{
			this.dd=dd;
			this.mm=mm;
			this.yy=yy;
		}
	    private int dd,mm,yy;
	    
	    public int getDd()
	    {
	    	return dd;
	    }
	    public void setDd(int dd)
	    {
	    	this.dd=dd;
	    }
	    public int getMm()
	    {
	    	return mm;
	    }
	    public void setMm(int mm)
	    {
	    	this.mm=mm;
	    }
	    public int getYy()
	    {
	    	return yy;
	    }
	    public void setYy(int yy)
	    {
	    	this.yy=yy;
	    }
	    public void showDate()
	    {
	    	System.out.println(dd+" "+mm+" "+yy);
	    }
	    
		public static void main(String[] args) 
		{
			System.out.println("I am parametric Constructor");
			MyDate obj=new MyDate(11,03,1999);
			obj.showDate();
			obj.setDd(2);
			obj.setMm(12);
			obj.setYy(1996);
			System.out.println("By Setter Getter Method ");
			obj.showDate();

		}

	}

}
