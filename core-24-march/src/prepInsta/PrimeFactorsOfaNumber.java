package prepInsta;

public class PrimeFactorsOfaNumber 
{ 
  static int isPrime(int n) 
  {
	  for(int i=2;i<=Math.sqrt(n);i++)
	  {
		 if(n%i==0)
			 return 0;
	  }
	  return 0;
  }
  public static void primeFactors(int n)
  {
	  for(int i=2;i<=n;i++)
	  {
		  if(isPrime(i)==0)
		  {
			int x=n;
			while(x%i==0)
			{
				System.out.println(i+" ");
				x/=i;
			}
			
		  }
		  
	  }
  }
  public static void main(String[] args) 
  {
	int n=90;
    primeFactors(n);
}
}
