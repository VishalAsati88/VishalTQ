package inheritance;

public class Cricket extends Game
{

	@Override
	public void rules()
	{
		System.out.println("must be 2 batsman ");
		System.out.println("20-20 over");
	}
	@Override
	public void noOfPlayers()
	{
		System.out.println("11 players");
	}
	public static void main(String[] args) 
	{
		Game c1=new Soccer();
		c1.rules();
		c1.noOfPlayers();

	}

}
