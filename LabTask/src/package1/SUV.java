package package1;



public class SUV extends Car {
    
    String engineType,gearType;
    
    SUV()
    {
    	super();
    	engineType=" ";
    	gearType=" ";
    }
    SUV(int carNo,String colour,double price,int numOfSeats,String engineType,String gearType)
    {  
    	super(carNo,colour,price,numOfSeats);
    	this.engineType=engineType;
    	this.gearType=gearType;
    }
    public Car displayDatails()
    {
    	return new Car();
    }
    public String toString()
    {
    	return super.toString()+" "+engineType+" "+gearType;
    }
    
	public static void main(String[] args) 
	{
		SUV s1=new SUV(1996,"Brown",320000,6,"petrol","5 gear");
	//	SUV s2=s1.displayDatails();
		//System.out.println(s2);
		System.out.println(s1);

	}

}
