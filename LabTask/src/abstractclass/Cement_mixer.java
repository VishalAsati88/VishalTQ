package abstractclass;

public class Cement_mixer extends Equipment {

	@Override
	public void mix() 
	{
	    System.out.println("I am override mix  method");	
	}
	public void pour()
	{
		System.out.println("I am in pour method");
	}
	public static void main(String[] args) 
	{ 
		Cement_mixer c1=new Cement_mixer();
		c1.mix();
		c1.pour();
		c1.fill();
		System.out.println("---------------------");
		
		Equipment e1=new Cement_mixer();
		c1.mix();
		c1.pour();
		c1.fill();
		
	}

}
