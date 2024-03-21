package labtask;

public class Ass6 
{  
	public boolean checkPrime(int num)
	{
		if(num==0||num==1)
		 return false;
		
		for (int i=2;i<=num/2;i++)
		{
			if (num%i==0)
				return false;
			
		}
		return true;
	}

	public static void main(String[] args) 
	{
		Ass6 obj=new Ass6();
		for(int j=0;j<100;j++)
		{
			if(obj.checkPrime(j))
			{
				System.out.println();
			}
			
		}
	}

}
