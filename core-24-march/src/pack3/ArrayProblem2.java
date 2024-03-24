package pack3;

public class ArrayProblem2
/*
 *  Given an array of integer,return the sum of the first 2 elements
 *  in the array.If the array length less than 2,just sum up the elements
 *  that exits,return 0 if the array length is 0;
 */
{   
	int meth1(int[] arr)
	{
	  if(arr.length>=2)
	  {
		  
	     return arr[0]+arr[1];
	  }
	  else if(arr.length==1)
	  {
		 return arr[0]; 
	  }
	  else
	  {
		  
		  return 0;
	  }
	}
	
	public static void main(String[] args)
	{
		ArrayProblem2 aobj=new ArrayProblem2();
		int arr[]= {23};
		int result=aobj.meth1(arr);
		System.out.println(result);
	}
}
