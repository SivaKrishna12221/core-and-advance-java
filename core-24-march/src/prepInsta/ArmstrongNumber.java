package prepInsta;

public class ArmstrongNumber //371=3^3+7^3+1^3=371;
{
	public static void main(String[] args) 
	{
		int num=407;
		int len;
		len=order(num);//function we get the length of a number
		
		if(armstrong(num,len))//function check if armstrong or not
		{
			System.out.println(num+" is  armstrong");
		}
		else
		{
			System.out.println(num+"is  not armstrong");
		}
	}
	    static  int order(int x)
		{
			int len=0;
			while(x!=0)
			{
				len++;
				x=x/10;
			}
			return len;
		}
	   static  boolean armstrong(int num,int len)
	    {
	    	int sum=0;
	    	int temp=num;
	    	int rem;
	    	while(temp!=0)
	    	{
	    		rem=temp%10;//7//0//
	    		sum=sum+(int)Math.pow(rem,len);//
	    		temp=temp/10;//407/10=40.7
	    	}
	    	return num==sum;
	    		
	    }
		
}
