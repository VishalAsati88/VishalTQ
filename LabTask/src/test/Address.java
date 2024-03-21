package test;

public class Address {
	
	String addr;
	String City;
	String state;

	public Address()
	{
	super();
	}                
	public Address(String addr,String City,String state )
	{
	super();
	this.addr=addr;
	this.City=City;
	this.state=state;
	  
	} 

	public String getAddr()
	{
	return addr;
	}
	public String getCity()
	{
	return City;
	}
	public String getState()
	{
	return state;
	}

	
	@Override
	public String toString() {
		return "Address [addr=" + addr + ", City=" + City + ", state=" + state + "]";
	}
	public static void main(String args[])
	{


	}


}
