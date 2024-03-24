package prepInsta;

public class StrongNumber 
/*
 * sum of factorial of each individual numbers equals to 145;
 * num=145===1!+4!+5!=145
 */
{
  static boolean detectStrong(int num)
  {
	  int digit;
	  int temp=num;
	  int sum=0;
	  while(temp!=0)
	  {
		  digit=temp%10;
		  sum+=fact(digit);
		  temp=temp/10;
	  }
	  if(sum==num)
		  return true;
	  else 
		  return false;
	  
  }
  static int fact(int digit)
  {
	int   res=1;
	for(int i=1;i<=digit;i++)
	{
		res*=i;
	}
	return res;
  }
  public static void main(String[] args) 
  {
	 int num=40585;
	 if(detectStrong(num))
	 {
		 System.out.println(num+"is a Strong number");
	 }
	 else
	 {
		 System.out.println(num+"is not a Strong number");
	 }
}
}
