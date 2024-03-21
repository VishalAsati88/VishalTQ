package labtask;

public class TernaryDis 
{   public void dis(int bill)
	{
	   
	   double dis;
	   dis=(bill>10000)?(bill*10.0/100):(bill*5.0/100);
	   System.out.println(dis);
	   
	   
	}

	public static void main(String[] args)
	{
		TernaryDis obj=new TernaryDis();
		obj.dis(15000);

	}

}
