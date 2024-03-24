package pack1;

public  class ClassA 
{
	
 public static void main(String[] args) 
 {
  int  num1=955;
  int num2=155;
  int sum1=getDivisorsSum(num1);
  int sum2=getDivisorsSum(num2);
  if(num1/sum1==num2/sum2)
	  System.out.println("friendly pair");
  else
  {
	  System.out.println("not friendly pair");
  }
 }
   static int getDivisorsSum(int num)
   {
	   int sum=0;
	   for(int i=1;i<num;i++)
	   {
		   if(num%i==0)
			   sum+=i;
	   }
	   return sum;
   }
 

   
}

