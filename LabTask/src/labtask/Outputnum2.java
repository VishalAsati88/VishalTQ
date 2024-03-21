package labtask;

public class Outputnum2 {

	public static void main(String[] args) 
	{
		int number=345;
		int sum=calculateOutput(number);
		System.out.println("Output: "+sum);
		

	}
	public static int calculateOutput(int num)
	{
		int sum=0;
		int multiplier=1;
		while (num>0)
		{
			int digit=num%10;
			sum+=digit*multiplier;
			multiplier*=digit;
			num/=10;
			
		}
		return sum;
	}

}
