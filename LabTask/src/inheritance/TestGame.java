package inheritance;

public class TestGame 
{

	public static void main(String[] args) 
	{
	  	Game g=new Game();
	  	BasketBall b1=new BasketBall();
	  	Soccer s1=new Soccer();
	  	Cricket c1=new Cricket();
	  	
	  	Game r;
	  	r=g;
	  	g.rules();
	  	g.noOfPlayers();
	  	
	  	r=b1;
	  	b1.rules();
	  	b1.noOfPlayers();
	  	
	  	r=s1;
	  	s1.rules();
	  	s1.noOfPlayers();
	  	
	  	r=c1;
	  	c1.rules();
	  	c1.noOfPlayers();
	  	
	  	
	  	
	  	
	  	
	  	

	}

}
