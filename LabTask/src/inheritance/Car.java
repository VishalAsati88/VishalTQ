package inheritance;

public class Car 
{
    String carNo,colour;
    double price;
    int noOFSeats;
    Owner owner;
    
    public Car()
    {
    	carNo="";
    	colour="";
    	price=0;
    	owner=new Owner();
    }
    
    public Car(String carNo,String colour,double price,Owner owner)
    {
    	this.carNo=carNo;
    	this.colour=colour;
    	this.price=price;
    	this.owner=owner;
    }
    public void setNoFSeats(int noOFSeats)
    {
    	this.noOFSeats=noOFSeats;
    }
    public void calculateDiscount()
    {
    	double discount=(price*0.1);
    	price=price-discount;
    }
    public String toString()
    {
    	return owner+" "+carNo+" "+colour+" "+price+" "+noOFSeats;
    }
    
	public static void main(String[] args) 
	{
	    Car obj=new Car();
	    //Owner o1=new Owner(1,"Vishal",25469874);
	    Car obj1=new Car("MP041996","White",250000,new Owner(12356,"Vivek",5645623));
	    obj1.setNoFSeats(6);
	    obj1.calculateDiscount();
	    System.out.println(obj1);
	    

	}

}
