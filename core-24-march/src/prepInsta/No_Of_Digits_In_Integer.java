package prepInsta;

public class No_Of_Digits_In_Integer 
{
  public static void main(String[] args)
  {
	int num=124525523;
	int digit=0;
	while(num!=0)
	{
		int rem=num%10;
		digit++;
		num/=10;
	}
	System.out.println("no.of digits ="+digit);
}
  
}
/*
 * package pack2;

public class Class 
{
 public static void main(String[] args) 
 {
	int number=124124;
	int digit=(int)Math.log10(number)+1;
	System.out.println(digit);
}
}
*/
