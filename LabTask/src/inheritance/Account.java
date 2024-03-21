package inheritance;

import java.util.Arrays;

public class Account 
{
	int accNo;
	String accName;
	double balance;
	long mobnum[];
	double civilscore[];
	String addinformation[];
	
	Account()
	{
		accNo=0;
		accName=" ";
		balance=0;
		
	}
	Account(int accNo,String accName,double balance,long mobnum[],double civilscore[],String addinformation[])
	{
		this.accNo=accNo;
		this.accName=accName;
		this.balance=balance;
		this.mobnum=mobnum;
		this.civilscore=civilscore;
		this.addinformation=addinformation;
	}
	public void deposit(double amount)
	{
		balance= balance + amount;
		System.out.println("Amount Deposited"+amount);
		System.out.println("Available Balance"+balance);
	}
	public void withdraw(double amount)
	{
		if(balance - amount>0)
		{
			balance=balance-amount;
		}
		else
		{
			System.out.println("Insufficient Balance");
		}
		System.out.println("Amount Withdraw"+amount);
		System.out.println("Available Balance "+balance);
	}
	public String toString()
	{
		return accNo+" "+accName+" "+balance+" "+Arrays.toString(mobnum)+" "+Arrays.toString(civilscore)+" "+Arrays.toString(addinformation);
	}

	public static void main(String[] args) 
	{
		
		//Without Arrays
		/*Account obj=new Account();
		
		Account obj1=new Account(1,"Vishal",50000);
		obj1.deposit(2000);
		obj1.withdraw(6000);
		System.out.println(obj1);*/
		
		// with Array
		Account arr[]=new Account[4];
		long l1[]={88260790};
		double c1[]={722};
		String s1[]={"This account transaction is very good"};
		arr[0]=new Account(101,"Vishal",50000,l1,c1,s1);
		long l2[]={90309373};
		double c2[]={650};
		String s2[]={"This account transaction is greater than all accounts"};
		arr[1]=new Account(102,"vivek",30000,l2,c2,s2);
		long l3[]={97557634};
		double c3[]={530};
		String s3[]={"This account transaction is very bad"};
		arr[2]=new Account(103,"vinay",20000,l3,c3,s3);
		long l4[]={99932790};
		double c4[]={700};
		String s4[]={"This account tranction is pretty good"};
		arr[3]=new Account(104,"vikas",10000,l4,c4,s4);
		
		
		//for printing any array with eachforloop
		for(Account ac:arr)
		{
			System.out.println(ac);
		}
		System.out.println("..................");

		//for Searching

		for(Account ac:arr)
		{
			long d[]=ac.mobnum;
			for(long da:d)
			{
				if(da.equals())
				{
				  System.out.println(da);	
				}
				
			}
			
		}

	}

}

