package pack1;

public class ClassBIggest 
{

	   void meth1(int a,int b,int c)
	   {
		   System.out.println("finding biggest among three values");
		   if(a>b)
		   {
			   System.out.println(a+"is biggest value");
		   }
		  
		   else if(b>c)
		   {
			   System.out.println(b+" is biggest value");
		   }
		   else
		   {
			   System.out.println(c+ " is biggest value");
		   }
			   
	   }
	   public static void main(String[] args) 
	   {
		   ClassBIggest aobj=new ClassBIggest();
		   aobj.meth1(32423,353352,5323552);
		
	}
	   
}
	/*
	 * finding biggest among three values
	42 is biggest value
	*/



