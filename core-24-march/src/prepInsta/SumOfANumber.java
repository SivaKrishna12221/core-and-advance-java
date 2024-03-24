package prepInsta;

public class SumOfANumber
{
	public static void main(String[] args) 
	{
		int num=342343;
		int sum=0;
		while(num!=0)
		{
			sum+=num%10;//here we get remainder value 0+5=10
			num=num/10;//here we get quotient value 1234.5
			//int doesn't accept floating values
		}
		System.out.println("sum of given value:"+sum);
	}
}