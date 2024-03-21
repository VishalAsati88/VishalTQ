package labtask;

import java.util.Scanner;

public class MonthDays28Or29 
{
   public void monthD()
   {
	 int num;
     System.out.println("Enter month");
     Scanner sc=new Scanner(System.in);
     num=sc.nextInt();
     
     switch(num)
     {case 1:
      case 3:
      case 5:
      case 7:
      case 8:
      case 10:
      case 12:
      System.out.println("31 days");
      break;
      case 2:System.out.print("Enter year");
    	  int y=sc.nextInt();
          if(y%400==0  ||  y%100!=0 && y%4==0)
          {
        	  System.out.println("29 days=leap year");
          }
          else
          {
        	  System.out.println("28 days=not leap year");
          }
          break;
      case 4:
      case 6:
      case 9:
      case 11:
      System.out.println("30 days");
      break;
     }
      
     
     
     }
     
     
     
	public static void main(String[] args) 
	{
		MonthDays28Or29 obj=new MonthDays28Or29();
		obj.monthD();

	}

}
