package prepInsta;

public class No_of_integers_which_exactly_x_divisor 
{
  public static void main(String[] args) 
  {
	int n=7;
	int x=2;
	int count=0;
	for(int i=1;i<=n;i++)
	{
		int count_factors=0;
		for(int j=1;j<=i;j++)
		{
			if(i%j==0)
			{
				count_factors++;
			}
		}
		if(count_factors==0)
		
			count++;
	}
	System.out.println(count++);
}
}
