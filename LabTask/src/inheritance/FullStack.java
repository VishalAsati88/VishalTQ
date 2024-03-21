package inheritance;

public class FullStack extends Developer
{

	double salary,workingHrs=8;
	String skillTest;
	
	//@Override
    public void Salary()
    {
    	salary=80000;
    	System.out.println("Enter Sal "+salary);
    	System.out.println("Working Hrs "+workingHrs);
    }
	//@Override
    public void skillTest()
    {
    	skillTest="good coding practise, good command on backend";
    	System.out.println("Skills Are "+skillTest);
 
    }
    
    
    public static void main(String[] args) 
    {
    	
    }
    

}