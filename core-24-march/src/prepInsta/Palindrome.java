package prepInsta;

public class Palindrome //1234321 //same as reverse
{
  public static void main(String[] args)
  {
	  int num=123454321;
	  int reverse=0;
	  int rem;
	  int temp=num;
	  while(temp !=0)
	  {
		  rem=temp % 10;
		  reverse=reverse*10+rem;
		  temp=temp/10;
	  }
	  System.out.println("reverse of num is:"+reverse);
	  if(num==reverse)
	  {
		  System.out.println("palindrome");
	  }
	  else
	  {
		  System.out.println("not palindrome");
	  }
  }
}
