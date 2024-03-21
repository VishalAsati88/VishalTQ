package labtask;
import java.util.Scanner;

public class NestesSwitchColl 




 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter coll year");
		int collYear=sc.nextInt();
		System.out.println("Enter branch");
		char branch=sc.next().charAt(0);
		switch(collYear)
		{
		case 1:
			System.out.println("Computer,English,Mathematics");
			break;
		case 2:
			switch(branch)
			{
			case 'C':
				System.out.println("Operating System,Java,Data Structure");
				break;
			case 'E':
				System.out.println("Micro Processor,Logic Switching Theory");
				break;
			case 'M':
				System.out.println("Drawing,Manufacturing machines");
				break;
			default :
				System.out.println("No subject");
				break;
			}
			break;
		case 3:
			switch(branch)
			{
			case 'C':
				System.out.println("Computer Organization,Multimedia");
				break;
			case 'E':
				System.out.println("Fun Of logic design,MicroElectronic");
				break;
			case 'M':
				System.out.println("Internal Combustion Engines,Mechanical Vibration ");
				break;
			default :
				System.out.println("No subject");
				break;	
			}
			break;
		case 4:
			switch(branch)
			{
			case 'C':
				System.out.println("Data Cumm & Networks,Multimedia");
				break;
			case 'E':
				System.out.println("Embedded System,Image processing");
				break;
			case 'M':
				System.out.println("Production Tec,Thermal Engineering");
				break;
			default :
				System.out.println("No subject");
				break;
			}
			break;
		default :
			    System.out.println("No year or No Subject");
			
			
			
		
		
		}

	}

}

