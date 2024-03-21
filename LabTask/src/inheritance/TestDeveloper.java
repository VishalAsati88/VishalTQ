package inheritance;

public class TestDeveloper 
{
	public static void main(String[] args) 
	{ 
		Developer d=new Developer();
		FullStack f=new FullStack();
		Java j=new Java();
		Python p=new Python();
		
		Developer ref;
		ref=d;
		d.Salary();
		d.skillTest();
		System.out.println("..........");
		
		ref=f;
		f.Salary();
		f.skillTest();
		System.out.println(".............");
	
		ref=j;
		j.Salary();
		j.skillTest();
		System.out.println("............");
		
		ref=p;
		p.Salary();
		p.skillTest();
		
		
		
	}
}
