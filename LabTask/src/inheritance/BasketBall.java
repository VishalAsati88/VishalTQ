package inheritance;

public class BasketBall extends Game 
{
	@Override
    public void rules()
    {
    	System.out.println("players height should be 5 ft");
    	System.out.println("players weight should be above 50 kg");
    }
	@Override
    public void noOfPlayers()
    {
    	System.out.println("Max 6 players");
    }
	public static void main(String[] args) 
	{
		Game b1=new BasketBall();
		b1.rules();
		b1.noOfPlayers();
 
	}

}
