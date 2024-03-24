package prepInsta;

public class RootsOfQuadraticEquation
{
	public static void main(String[] args) 
	{
		int a=4,b=2,c=6;
		findRoots(a,b,c);
	}
	static void findRoots(int a,int b,int c)
	{
		if(a==0)
		{
			System.out.println("invalid");
			return;
		}
		
	    int d=b*b-4*a*c;
	    double sqrt_value=sqrt(abs(d));
	    if(d>0)
	    {
	    	System.out.println("The roots are real and different");
	    	System.out.println((double)(-b+sqrt_value)/2*a+"\n "+(double)(-b-sqrt_value)/2*a);
	    }
	    else if(d==0)
	    
	    {
	    	System.out.println("The roots are real and same");
	    	System.out.println(-(double)b/2*a+"\n"+-(double)b/2*a);
	    }
	    else
	    {
	    	System.out.println("the roots are real and complex");
	    	System.out.println((double)(-b+sqrt_value)/2*a+"i"+"\n"+(double)(-b-sqrt_value)/2*a+"i");
	    }
		
	}
	private static double sqrt(Object abs) {
		// TODO Auto-generated method stub
		return 0;
	}
	private static Object abs(int d) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	

}
