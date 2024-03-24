package prepInsta;

public class SumOfNaturalNums 
{
	void meth1(int num)
	{
		int sum=0;
		for(int i=0;i<=num;i++)
			sum=sum+i;
		System.out.println(sum);
	}
	public static void main(String[] args)
	{
		SumOfNaturalNums aobj=new SumOfNaturalNums();
		aobj.meth1(99+1);
		/*
		int n=10;
		System.out.println(n*(n+1)/2);
		*/
	} 
}

