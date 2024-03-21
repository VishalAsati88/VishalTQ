package labtask;

import java.util.Scanner;

public class ProductClass 
{
	int proid,quantity;
	String name,description;
	double price,discount,totalprice;
	
	public void setData()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter ProId");
		proid=sc.nextInt();
		System.out.println("Enter ProdName");
		name=sc.next();
		System.out.println("Enter description");
		description=sc.next();
		System.out.println("Enter price");
		price=sc.nextDouble();
		System.out.println("Enter quantity");
		quantity=sc.nextInt();
		
	}
	public void calprice()
	{
		totalprice=price*quantity;
		
	}
	public void discountprice()
	{
		if (totalprice>2500  &&  totalprice<3000)
			discount=(totalprice*0.10);
		else if (totalprice>3000 && totalprice<4000)
			discount=(totalprice*0.20);
		else if (totalprice>4000 && totalprice<5000)
			discount=(totalprice*0.30);
		else if (totalprice>5000 && totalprice<7000)
			discount=(totalprice*0.35);
		else if (totalprice>7000 && totalprice<10000)
			discount=(totalprice*0.40);
	}  
	public void showData()
	{   
		System.out.println("         Product  Bill          ");
		System.out.println("your proid is         "+proid);
		System.out.println("your proname is       "+name);
		System.out.println("your prodesc is       "+description);
		System.out.println("your product price is "+price);
		System.out.println("your pro quantity is  "+quantity);
		System.out.println("your pro totalprice is"+totalprice);
		System.out.println("your pro dis is       "+discount);
		System.out.println("----------------------------------");
 	}
	

	public static void main(String[] args) 
	{
		ProductClass obj=new ProductClass();
		obj.setData();
		obj.calprice();
		obj.discountprice();
		obj.showData();
		

	}

}
