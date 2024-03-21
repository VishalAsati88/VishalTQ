package labtask;

public class TernaryVoteorNot 
{
    public void voteornot(int age)
    {
    	String str=" ";
    	str=(age>18)?("Eligible for vote"):("Not Eligible for vote");
    	System.out.println(str);
    	
    }
	public static void main(String[] args) 
	{
		TernaryVoteorNot obj=new TernaryVoteorNot ();
		obj.voteornot(26);

	}

}
