package labtask;

public class TernaryThreeMax 
{
    public int maxthree(int a,int b,int c)
    {
    	int max=0;
    	max=(a>b)?(a>c?a:c):(b>c? b:c);
    	return max;
    }
	public static void main(String[] args) 
	{
		TernaryThreeMax obj=new TernaryThreeMax();
		System.out.print("Max number is"+obj.maxthree(100,200,300));

	}

}
