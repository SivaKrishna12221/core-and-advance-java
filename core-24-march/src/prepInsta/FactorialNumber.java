package prepInsta;

public class FactorialNumber 
{
   static int factorial(int num)
   {
	   int res=1,i;
	  
	   for( i=2;i<=num;i++)
	   {
		   res*=i;
	   }
	   return res;
   }
   
   public static void main(String[] args) 
   {
	   int num=5;
	   System.out.println(num+"factorial is "+factorial(num));
		   
   }
}
