package inheritance;

public class Python extends Developer
{
	double salary,workingHrs=8;
	String skillTest;
	
	//@Override
    public void Salary()
    {
    	salary=100000;
    	System.out.println("Enter Sal "+salary);
    	System.out.println("Working Hrs "+workingHrs);
    }
	//@Override
    public void skillTest()
    {
    	skillTest="Behavior good, good command on pyhton";
    	System.out.println("Skills Are "+skillTest);
 
    }
    
    
    public static void main(String[] args) 
    {
    	
    }
    

}
	

