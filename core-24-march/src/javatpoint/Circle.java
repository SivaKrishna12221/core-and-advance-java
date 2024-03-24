package javatpoint;

public class Circle
{
   OperationSquare op;
   double pi=3.14;
   double area(int n)
  {
	 op=new OperationSquare();
	 int rsquare=op.square(n);
	 return pi*rsquare;
	  
  }
  public static void main(String[] args) 
  {
	Circle c=new Circle();
	double result =c.area(10);
	System.out.println(result);
}
}
