package prepInsta;

public class PrimeNumber
{
 public static void main(String[] args) 
 {
	int num=23;
	checkPrime(num);
 }
	private static void checkPrime(int num)
	{
		int count=0;
		//negative numbers 0,1 are not primes
		if(num<2)
			System.out.println(num+"not a prime number");
		//to count the divisor from[1,num]
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
				count=count+1;
		}
		if(count>2)
		
			System.out.println(num+" is not prime");
		
		else
		
			System.out.println(num+" is prime number");
		
	}
 
}
