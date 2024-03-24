package pack3;

import java.util.Arrays;

public class ArrayProblem5 
/*
 * Return an int array length 3 containing the first 3 digits of 
 * pi,{3,1,4};
 */
{
  int[] makepi()
  {
	  int arr[]= {3,1,4};
	  return arr;
  }
  public static void main(String[] args)
  {
	ArrayProblem5 aobj=new ArrayProblem5();
	
	int result[] =aobj.makepi();
	System.out.println(Arrays.toString(result));
}
}
