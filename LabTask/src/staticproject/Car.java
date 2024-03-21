package staticproject;

public class Car 
{
	private int model;
	private double price;
	private String fueltype,registrationnumber;
	private static double totalSales=0,totalRevenue=0;
	
	
	Car()
	{ 
		totalSales++;
		
		
	}
	
	Car(int model,double price,String fueltype,String registrationnumber)
	{
		this();
		this.model=model;
		this.price=price;
		this.fueltype=fueltype;
		this.registrationnumber=registrationnumber;
		totalRevenue=totalRevenue+price;
	}
	public static double gettotalSales()
	{
		return totalSales;
	}
	public static double gettotalRevenue()
	{
		return totalRevenue;
	}
	public void show()
	{
		System.out.println("Modelnum  "+model);
		System.out.println("price  "+price);
		System.out.println("fueltype  "+fueltype);
		System.out.println("registrationnumber  "+registrationnumber);
	}

	
	

	public static void main(String[] args) 
	{
      Car c1=new Car(101,35000,"Petrol","24056");
      c1.show();
      
      Car c2=new Car(1012,25000,"Diesel","24057");
      c2.show();
     
      Car c3=new Car(103,45000,"Hybrid","24058");
      c3.show();
      
      Car c4=new Car(104,20000,"Petrol","24059");
      c4.show();
      
      System.out.println(Car.gettotalRevenue());
      System.out.println(Car.gettotalSales());
      
      
      


	}

}
