package prepInsta;

public class Practice2 
{ 
	static int isPrime(int n)
	{
		if(n<2)
		{
			return -1;
		}
		else
		{
			int x=n/2;
			for(int i=2;i<x;i++)
			{
				if(n%i==0)
				{
					return -1;
				}
			}
		}
		return 1;
	}
  public static void main(String[] args)
  {
	int f_position=1;
	int s_position=10;
	for(int i=f_position;i<=s_position;i++)
	{
		if(isPrime(i)==1)
		{
			System.out.println(i);
		}
	}
}
}

