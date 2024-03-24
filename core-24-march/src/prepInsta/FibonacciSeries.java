package prepInsta;

public class FibonacciSeries 
//A series of number in which each number is the sum of
//preceding numbers is known as a fibonacci numbers
{
   public static void main(String[] args) 
   {
	
	 int num=10;
	 int a=0;
	 int b=1;
	 //here print the a value and b value
	 System.out.print(a+","+b+",");
	 int nextTerm;
	 for (int i=2;i<num;i++)//here we take from 0
	 {
		 nextTerm=a+b;
		 a=b;//swapping happen
		 b=nextTerm;
		 System.out.print(nextTerm+",");
	 }
	 
	 
	}
}

