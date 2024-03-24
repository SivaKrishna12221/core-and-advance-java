package prepInsta;

public class PerfectNumber 
/*
 * sum of factors of equals to given number except given number
 *28 factors,1,2,4,7,14 ==>1+2+4+7+14=28
 */
{
  public static void main(String[] args) 
  {
	int num=28;
	int sum=0;
	for(int i=1;i<num;i++)
	{
		if(num%i==0)
		   sum=sum+i;
	}
	if(sum==num)
		System.out.println(num+"is perfect number");
	else
		System.out.println(num+"is not a perfect number");
}
}
