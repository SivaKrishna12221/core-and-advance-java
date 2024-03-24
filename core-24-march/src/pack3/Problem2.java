/*
 * Given an array of integer ,return the sum of the first 2 elements in the array .
 * If the array length less than 2,just sum up the elements that exist ,return 0 if
 * the array length is 0.
 * 1,2 ,3 ----3
 * 5,5 -------10
 * 8,2,1,4----10
 */
package pack3;

public class Problem2 
{
	int meth3(int [] arr)
	{
		if(arr.length>=3)
			return arr[0]+arr[1] +arr[2];
			//else if(arr.length>=2)
				//return arr[0]+arr[1];
			else if(arr.length==1)
				return arr[0];
			else 
				return 0;
	}
	public static void main(String[] args)
	{
		Problem2 aobj=new Problem2();
		int input[]= {7,45,};
		int result=aobj.meth3(input);
		System.out.println(result);
		
	}

}
