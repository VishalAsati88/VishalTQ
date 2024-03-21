package inheritance;

public class SavingAccount extends Account
{
    double rate;
    int panNo;
    
    public SavingAccount()
    {
    	
    }
    public SavingAccount(int accNo,String accName,double balance,double rate,int panNo)
    {
    	super(accNo,accName,balance);
    	this.rate=rate;
    	this.panNo=panNo;
    	
    }
    public void checkBalance()
    {
    	balance=balance+(balance*rate);
    	System.out.println("Balance After interest "+balance);
    }
    
    public String toString()
    {
    	return super.toString()+" "+rate+" "+panNo;
    }
    
    
	public static void main(String[] args) 
	{
	    SavingAccount obj=new SavingAccount();
	    SavingAccount obj1=new SavingAccount(123,"Vishal",65000,5,456854);
	    System.out.println(obj1);
	    obj1.checkBalance();
	    System.out.println();
	    obj1.deposit(5000);
	    System.out.println();
	    obj1.withdraw(10000);

	}

}
