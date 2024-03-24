package prepInsta;

import java.util.Scanner;

public class ArmstrongNumsbetweentwoNums 
{
	Scanner sc=new Scanner(System.in);
	void meth1()
	{
		System.out.println("please enter low value and high value:");
		int low=sc.nextInt();
		int high=sc.nextInt();
		System.out.println("The armstrong numbers between "+low+"to "+high+"is:");
		for(int num=low;num<=high;num++)
		{
			int sum=0,temp,rem,len;
			
			len=Order(num);
			temp=num;
			while(temp!=0)
			{
				rem= temp%10;
				sum=sum+(int)Math.pow(rem,len);
				temp=temp/10;
			};
			if(num==sum)
			{
				System.out.print(num+" ");
			}
		}
	   
	}
	static int Order(int x)
	{
		int len=0;
		while(x!=0)
		{
		   len++;
		   x/=10;
		}
		return len;
	}
  public static void main(String[] args) 
  {
	  ArmstrongNumsbetweentwoNums aobj=new ArmstrongNumsbetweentwoNums();
	  aobj.meth1();
  }
}
