package prepInsta;

public class ReverseOfANumber //reverse*10+rem;
{
  public static void main(String[] args)
  {
	int num=345464;
	int reverse=0;
	int rem;
	while(num!=0)
	{
		rem=num%10;
		reverse=reverse*10+rem;
		num=num/10;
	}
	
		System.out.println("Reverse of a number is:"+reverse);
	
}
}
