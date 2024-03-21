package labtask;
import java.util.Scanner;

public class MonthDays 
{
        public void month()
			{
		       int num;
		       System.out.println("enter month number ");
		       Scanner sc=new Scanner(System.in);
		       num=sc.nextInt();
		       
		       switch(num)
		       {
		       case 1:
		    	   System.out.println("january=31 days");
		           break;
		       case 2:
		           System.out.println("february=28 days");
		           break;
		       case 3:
		           System.out.println("march=31 days");
		           break;
		       case 4:
		           System.out.println("april=30 days");
		           break;
		       case 5:
		           System.out.println("may= 31 days");
		           break;
		       case 6:
		           System.out.println("june= 30 days");
		           break;
		       case 7:
		    	   System.out.println("july= 31 days");
		           break;
		       case 8:
		    	   System.out.println("august= 31 days");
		           break;
		       case 9:
		    	   System.out.println("september= 30 days");
		           break;
		       case 10:
		    	   System.out.println("october= 31 days");
		           break;
		       case 11:
		    	   System.out.println("november= 30 days");
		           break;
		       case 12:
		    	   System.out.println("december= 31 days ");
		           break;
		       default:
		    	   System.out.println("no days");
		    	   break;
		           
		           
		           
		           
		           
		           
		       }
			
			}

			public static void main(String[] args) 
			{
				MonthDays obj=new MonthDays();
				obj.month();

			}

		}




