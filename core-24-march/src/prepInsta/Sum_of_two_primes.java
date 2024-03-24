package prepInsta;

import java.util.Scanner;

public class Sum_of_two_primes 
{
  public static void main(String[] args) 
  {
	Scanner sc=new Scanner(System.in);
	System.out.println("please enter a number");
	int num=sc.nextInt();
	int x=0;
	for(int i=2;i<=num/2;i++)
	{
		if(checkPrime(i)==1)
		{
			if(checkPrime(num-i)==1)
			{
				System.out.println(num+"="+i+"+"+(num-i));
				x=1;
			}
		}
		
	}
	if(x==0)
	
		System.out.println(+num+"cannot be expressed as of two prime numbers");
	
    }
  public  static int checkPrime(int n)
  {
	  int c=1;
	  for(int i=2;i<n;i++)
	  {
		  if(n%i==0);
		  {
			  c=0;
			  break;
		  }
	  }
	  return c;
  }
}
