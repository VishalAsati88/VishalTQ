package labtask;

public class OutputNum 
{  
	int countDigits(int num)
	{
	
	}
    int calciPower(int base,int exp)
    {
    	
    }
	public static void main(String[] args) 
	{
		int num=345;
		int result=0;
		int digits=countDigits(num);
		while (num>0)
		{
			int rem=num%10;
			result=calcipower(rem,digits);
			num=num/10;
			digits--;
			
			
		}
		System.out.println(result);
		

	}

}
