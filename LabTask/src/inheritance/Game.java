package inheritance;

public class Game 
{
    /*int gid,noOfPlayers;
    String gname;
     
    
    Game()
    {
    	
    }
    Game(int gid,String gname,int noOfPlayers)
    {
    	this.gid=gid;
    	this.gname=gname;
    	this.noOfPlayers=noOfPlayers;
    }*/
	public void rules()
	{
		System.out.println("many rules");
	}
	public void noOfPlayers()
	{
		System.out.println("No of Players");
	}
	
	public static void main(String[] args) 
	{
	   Game g=new Game();
	   g.rules();
	   g.noOfPlayers();

	}

}
