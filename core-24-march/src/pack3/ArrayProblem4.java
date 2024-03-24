package pack3;

public class ArrayProblem4 
/*
 * Given an array of ints, return true if the array is length 1 or
 *  more ,and the first element and the last element are equal.
 *  
 */
{
  public boolean meth1(int []arr)	
  {
	 if(arr.length>=1&&arr[0]==arr[arr.length-1])
		 return true;
	  return false;
  }
  public static void main(String[] args) 
  {
	ArrayProblem4 aobj=new ArrayProblem4();
	int arr[]= {24,34,54,675,};
	boolean result=aobj.meth1(arr);
	System.out.println(result);
}
}
