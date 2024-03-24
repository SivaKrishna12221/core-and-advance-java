package prepInsta;

public class FactorOfNumber 
{
  public static void main(String[] args)
  {
	  int num=60;
	  System.out.println("factors of a" +num+":");
	  for(int i=1;i<=num;i++)
	  {
		  if(num%i==0)
		    System.out.print(i+" ");
	  }
	
}
}
