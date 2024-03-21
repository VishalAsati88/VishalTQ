package labtask;

public class TenaryTwoNum 
{
   public int maxtwo(int n1,int n2)
   {
	   int max=0;
	   max=(n1>n2)?(n1):n2;
	   return max;
	   
   }
   public static void main(String[] args) 
   {
	   TenaryTwoNum obj=new TenaryTwoNum ();
	   int res=obj.maxtwo(100,50);
	   System.out.println(res);
   }
}
