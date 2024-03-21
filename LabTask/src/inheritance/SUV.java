package inheritance;

public class SUV extends Car
{
    String engineType,gearType;
    
    SUV()
    {
    	super();
    	engineType=" ";
    	gearType=" ";
    }
    SUV(String carNo,String colour,double price,Owner owner,String engineType,String gearType)
    {  
    	super(carNo,colour,price,owner);
    	this.engineType=engineType;
    	this.gearType=gearType;
    	
    }
    public void setNoFSeats(int noOFSeats)
    {
    	this.noOFSeats=noOFSeats;
    }
    public void calculateDiscount()
    {
    	double discount=super.price;
    	super.price=super.price-discount;
    }
    public String toString()
    {
    	return super.toString() +" "+engineType+" "+gearType;
    }
    
    
    public static void main(String[] args) 
	{
		SUV s1=new SUV();
		System.out.println(s1);
		SUV s2=new SUV("MP344562","Gray",150000,new Owner(2145,"Vinay",45622),"diesel","C type" );
		s2.setNoFSeats(2);
	    s2.calculateDiscount();
	    System.out.println(s2);

	}

}
