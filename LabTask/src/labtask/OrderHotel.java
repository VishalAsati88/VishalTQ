package labtask;

import java.util.Scanner;

public class OrderHotel 
{ 
	int orderid;
	String customername;
	double discount;
	long totalorderprice;
	//orderitem
	int Dosa,manchurianrice,cholebhature,momos,chai;
	
	public void setData()
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("OrderId");
		orderid=sc.nextInt();
		System.out.println("Customer name");
		customername=sc.next();
		System.out.println("Enter Item");
		System.out.println("Dosa");
		Dosa=sc.nextInt();
		System.out.println("manchurianrice");
		manchurianrice=sc.nextInt();
		System.out.println("cholebhature");
		cholebhature=sc.nextInt();
		System.out.println("momos");
		momos=sc.nextInt();
		System.out.println("chai");
		chai=sc.nextInt();
		/*System.out.println("Quantity");
		quantity=sc.nextInt();*/
	}
	public void calculateprice()
	{
		totalorderprice=(Dosa)+(manchurianrice)+(cholebhature)+(momos)+(chai);
		
	}
	public void discountprice()
	{
		if (totalorderprice>1000 && totalorderprice<1500)
			  discount=(totalorderprice*0.10);
		else if (totalorderprice>1500 && totalorderprice<2000)
			  discount=(totalorderprice*0.20);
		else if (totalorderprice>2000 && totalorderprice<2500)
			discount=(totalorderprice*0.25);
		else if (totalorderprice>2500 && totalorderprice<3000)
			  discount=(totalorderprice*0.30);
		
	}
	public void showData()
	{
		System.out.println("             Your Bill              ");
		System.out.println("OrderId is            "      +orderid);
		System.out.println("Customer Name is      "+customername);
		System.out.println("Dosa price is         "+Dosa);
		System.out.println("Manchurian price is   "+manchurianrice);
		System.out.println("cholebhature price is "+cholebhature);
		System.out.println("momos price is        "+momos);
		System.out.println("Chai price is         "+chai);
		System.out.println("totalprice price is   "+totalorderprice);
		System.out.println("Discount price is     "+discount);
		
		
		
		
	}

	public static void main(String[] args) 
	{
		OrderHotel obj=new OrderHotel ();
		obj.setData();
		obj.calculateprice();
		obj.discountprice();
		obj.showData();
		
		
		

	}

}
