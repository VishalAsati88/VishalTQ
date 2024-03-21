package abstractclass;

public abstract class PhoneBook {
	
	String name;
	long contact;
	
	public PhoneBook()
	{
		
	}
    public PhoneBook(String name,long contact)
    {
    	this.name=name;
    	this.contact=contact;
    }
    
    public void show()
    {
    	System.out.println(name+" "+contact);
    	
    }
    /*public static void main(String[] args) 
    {
    	PhoneBook p1=new PhoneBook("hjkdhd",21456666);
    	p1.show();
	}*/
    
}
