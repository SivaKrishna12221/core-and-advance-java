package prepInsta;

public class PrimeNumbersBetween1_100
{
  public static void main(String[] args) {
	int a=1;
	int b=100;
	for(int i=a;i<=b;i++)
	{
		if(checkprime(i))
		{
			System.out.print(i+" ");
		}
	}
}
 public static boolean checkprime(int n)
  {
	 if(n<2)
	 {
		 return false;
	 }
	 else
	 {
		 /*
		  * no need to run loop till num-1 as for any number x
		  * the range (num/2+1,num)wont be divisible anyways.
		  * example 36 wont be divisible by anything b/w 19-35
		  */
		 int x=n/2;
		 for(int i=2;i<x;i++)
		 {
			 if(n%i==0) {
				 
			 
			 return false;
			 }
		 }
	 }
	 //the number would be prime if we reach here
	 return true;
	 
  }
}
