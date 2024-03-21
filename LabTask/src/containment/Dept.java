package containment;

public class Dept 
{
    private int deptid;
    private String deptname;
    
    public Dept()
    {
    	deptid=0;
    	deptname="";
    }
    
    public Dept(int deptid,String deptname)
    {
    	this.deptid=deptid;
    	this.deptname=deptname;
    	
    }
    public void showData()
    {
    	System.out.println(deptid+" "+deptname);
    }
	public static void main(String[] args) 
	{
		Dept d1=new Dept();
		d1.showData();
		
		Dept d2=new Dept(101,"IT");
		d2.showData();

	}

}
