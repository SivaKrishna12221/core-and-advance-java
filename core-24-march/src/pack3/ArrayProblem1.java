package pack3;

import java.util.Arrays;

public class ArrayProblem1 
/*
 * Given an int array length 3 if there is 2 in the array immediately
 * followed by a 3,change the element 3 to 0 and return the changed array;
 */
{
	int[] meth1()
	{
		int arr1[]= {2,3,2};
		
		for(int i=0;i<arr1.length-1;i++)
		{
			if(arr1[i]==2&&arr1[i+1]==3)
				arr1[i+1]=0;
		}
		return arr1;
	}
  public static void main(String[] args) 
  {
	ArrayProblem1 ap=new ArrayProblem1();
	int result[]=ap.meth1();
	System.out.println(Arrays.toString(result));
}
}
