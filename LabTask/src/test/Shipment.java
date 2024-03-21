package test;

public class Shipment  {
	
	int shipId;
	String Cust_name;
	Address addr;
	Mydate shipDate;

	public Shipment()
	{
	super();
	} 
	public Shipment(int shipId,String Cust_name,Address addr,Mydate shipDate)
	{
	super();
	this.shipId=shipId;
	this.Cust_name=Cust_name;
	this.addr=addr;
	this.shipDate=shipDate;
	}

	public int getShipId()
	{
	return shipId;
	}
	public String getCust_name()
	{
	return Cust_name;
	}
	public Address getAddr()
	{
	return addr;
	}
	public Mydate getShipDate()
	{
	return shipDate;
	}

	

	@Override
	public String toString() {
		return "Shipment [shipId=" + shipId + ", Cust_name=" + Cust_name + ", addr=" + addr + ", shipDate=" + shipDate
				+ "]";
	}
	public static void main (String args[])
	{



	}


}
