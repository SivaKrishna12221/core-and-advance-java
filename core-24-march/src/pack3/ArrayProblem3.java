package pack3;

public class ArrayProblem3 
/*
 * Given an array of ints ,return true if 6 appears as either the 
 * first or last element in the array .the array will be length 1 or more.
 */
{
  public boolean meth1(int [] num)
  {
	  if(num[0]==6||num[num.length-1]==6)
	   return true;
	  return false;
	  
  }
  public static void main(String[] args) 
  {
	ArrayProblem3 aobj=new ArrayProblem3();
	int arr[]= {6,3,3,64,2,6,2};
	boolean result=aobj.meth1(arr);
	System.out.println(result);
}
}
