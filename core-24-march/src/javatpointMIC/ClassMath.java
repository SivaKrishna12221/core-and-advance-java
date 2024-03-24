package javatpointMIC;

public class ClassMath
{
   
   
   public static void main(String[] args) 
   {	
    double x=32;
    double y=8;
	System.out.println("maximum value:"+Math.max(x, y));
	System.out.println("minimum value:"+Math.min(x, y));
	System.out.println("squart value:"+Math.sqrt(y));
	System.out.println("power value:"+Math.pow(x,2));
	System.out.println("logarithm value:"+Math.log(x));
	System.out.println("Logarithm value:"+Math.log(y));
	//return the logarithm of given value when base is 10
	System.out.println("log 10 value:"+Math.log10(x));
	//return the log of x+1;
	System.out.println("log1p of x is:"+Math.log1p(x));
	//return the power of 2
	System.out.println("exp of a is:"+Math.exp(x));
	//return (a power of 2)-1
	System.out.println("expm1 of a is:"+Math.expm1(x));
	
}
}
