package inheritance;

public class Java extends Developer
{
	double salary,workingHrs=8;
	String skillTest;
	
	//@Override
    public void Salary()
    {
    	salary=90000;
    	System.out.println("Enter Sal "+salary);
    	System.out.println("Working Hrs "+workingHrs);
    }
	//@Override
    public void skillTest()
    {
    	skillTest="Excellent Coding in java, speaking well";
    	System.out.println("Skills Are "+skillTest);
 
    }
    
    
    public static void main(String[] args) 
    {
    	
    }
    

}
	
	

