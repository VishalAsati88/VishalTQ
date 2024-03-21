package labtask;

public class TernaryPercentage 
{
	public void passfail(int per)
	{
		String result=" ";
		result=(per>=33)?("Pass"):("Fail");
		System.out.println(result);
	}

	public static void main(String[] args) 
	{
		TernaryPercentage obj=new TernaryPercentage();
		obj.passfail(65);

	}

}
