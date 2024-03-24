package prepInsta;

public class FriendlyPair 
/*
 * Friendly Pair
The numbers whose ( sum of divisors ) / number ratio is same are known as Friendly Pair Numbers.
Let's try and understand it better using an example

Example
Input : 6 28
Output : Yes, they are a friendly pair
Explanation : The factors of 6 and 28 except the numbers themselves are 1, 2, 3 and 1, 2, 4, 7, 14 respectively.
Now the sum of factors of both the numbers are 6 and 28 respectively. 
When we divide the sums with the numbers we get 1 and 1 respectively. 
As the ratio of both the number match, they are considered as a friendly pair.
 */
{
	public static void main(String[] args)
	{
	 int num1=6;
	 int num2=29;
	 int sum1=getDivisorsSum(num1);
	 int sum2=getDivisorsSum(num2);
	 if(num1/sum1==num2/sum2)
	 {
		 System.out.println("It is a friendly pair");
	 }
	 else
	 {
		 System.out.println("it is not a friendly pair");
	 }
	}
	static int getDivisorsSum(int num)
	{
		int temp=num;
		int sum=0;
		for(int i=1;i<temp;i++)
		{
			if(temp%i==0)
				sum=sum+i;
		}
		return sum;
	}
}
