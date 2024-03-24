package prepInsta;

public class HarshadNumber //24==>2+4=6, 6/24==0;
//sum of the given individual number is successfully divided  its own number
{
  public static void main(String[] args) 
  {
	int num=24;
	int sum=0;
	int digit;
	int temp=num;
	while(temp!=0)
	{
	   digit=temp%10;
	   sum=sum+digit;
	   temp/=10;
	   
	}
	if(num%sum==0)
	{
		System.out.println(num+"is harshad number");
	}
	else
	{
		System.out.println(num+"is not harshad number");
	}
}
}
