package prepInsta;

public class LCMofTwoNumbers 
{/*
	public static void main(String[] args)
	{
		int num1=36;
		int num2=60;
		//here we get maximum value of two numbers lcm is greater than given numbers
		int max=(num1>num2)?num1:num2;
		// LCM will atleast be >= max(num1, num2)
	    // Largest possibility of LCM will be num1*num2
		int lcm=0;
		for(int i=max;i<=num1*num2;i++)
		{
			if(i%num1==0&&i%num2==0)
			{
				lcm=i;
				break;
			}
		}
		System.out.println(lcm);
	}
	*/
	public static void main(String[] args) 
	{
		int num1=36;
		int num2=60;
		int hcf=0;
		for(int i=1;i<=num1||i<=num2;i++)
		{
			if(num1%i==0&&num2%i==0)
				hcf=i;
		}
		int lcm=(num1*num2)/hcf;
		System.out.println("lcm of two numbers:"+lcm);
		
	}

}
