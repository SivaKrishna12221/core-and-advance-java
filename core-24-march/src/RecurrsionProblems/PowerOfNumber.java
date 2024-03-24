package RecurrsionProblems;

public class PowerOfNumber 
{
  public static void main(String[] args) 
  {
	int base=5;
	int x=5;
  System.out.println(power(base,x));
  
}
  static int power(int base,int x)
  {
	  if(x==0)
		  return 1;
	  return (base*power(base,x-1));
  }
}
