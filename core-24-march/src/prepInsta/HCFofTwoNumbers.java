package prepInsta;

public class HCFofTwoNumbers//highest common multiple means
//take two numbers and find all the factors of two numbers
//select highest common multiple.
{
   public static void main(String[] args) 
   {
	int num1=24;
	int num2=72;
	int hcf=0;
	//by using or operators we can send two numbers at a into a loop
	for(int i=1;i<=num1||i<=num2;i++)
	{
		if(num1%i==0&&num2%i==0)
			hcf=i;
			
	}
	System.out.println("HCF of "+num1+" and "+num2+" is "+hcf);
}
}
