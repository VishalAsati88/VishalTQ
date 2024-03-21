package inheritance;

public class Soccer extends Game
{
	@Override
    public void rules()
    {
    	System.out.println("Use only legs not hand");
    	System.out.println("weight shoule be lass than 60 kg");
    }
	@Override
    public void noOfPlayers()
    {
    	System.out.println("11 players");
    }
	public static void main(String[] args) 
	{
		Game s1=new Soccer();
		s1.rules();
		s1.noOfPlayers();

	}

}
