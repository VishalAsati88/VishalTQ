package arrayproject;

public class AlternateElement 
{
	public static void showalternate(int num[])
	{
		for(int i=0;i<num.length;i++)
		{
			if(i%2==0)
			{
				System.out.println(num[i]);
			}
		}
	}

	public static void main(String[] args) 
	{ 
		int num[]={2,4,6,8,10,12,14,16,18,20,22,46,64,87};
		//System.out.println();
		AlternateElement.showalternate(num);

	}

}
