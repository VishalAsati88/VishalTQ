package package1;



public class Car {
	
	int carNo;
	String colour;
    double price;
    int numOfSeats;
    
    public Car()
    {
    	carNo=0;
    	colour="";
    	price=0;
    	numOfSeats=0;
    }
    
    public Car(int carNo,String colour,double price,int numOfSeats)
    {
    	this.carNo=carNo;
    	this.colour=colour;
    	this.price=price;
    	this.numOfSeats=numOfSeats;
    }
    public Car displayDetails()
    {
    	return new Car();
    }
    public String toString()
    {
    	return " "+carNo+" "+colour+" "+price+" "+numOfSeats;
    }
    
    public static void main(String[] args) 
	{
	   	Car c1=new Car(9020,"Black",50000,8);
	   	Car c2=c1.displayDetails();
	   	System.out.println(c2);
	   	System.out.println(c1);
	  
	   	
	   	

	}

}
