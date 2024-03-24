package javatpointMIC;

public class ClassMathB 
{
  public static void main(String[] args) {
	double a=30;
	//converting values to radian
	double b=Math.toRadians(a);
	System.out.println(b);
	//return the trigonometric sine of a 
	System.out.println("sine value of a is :"+Math.sin(a));
	//return the trigonemetric cosine value of 
	System.out.println("cosine value of a is:"+Math.cos(a));
	//return the trigonemetric tan value of a
	System.out.println("Tangent value of a is:"+Math.tan(a));
	//return the  trigonemetric arc sine of a
	System.out.println("sine value of a is:"+Math.asin(a));
	//return the trigonometric arc cos value of a 
	System.out.println("arc cos value:"+Math.acos(a));
	//returnt the trigonemetric arc tan
	System.out.println("arc tan value:"+Math.atan(a));
	//return the hyperbolic cosine value of a
	System.out.println("hyperbolic value:"+Math.cosh(a));
	//hyperbolic tan h value
	System.out.println("hyperbolic value:"+Math.tanh(a));
	
}
}
