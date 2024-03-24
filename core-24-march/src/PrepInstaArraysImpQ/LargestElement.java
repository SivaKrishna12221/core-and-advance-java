package PrepInstaArraysImpQ;

public class LargestElement 
/*
 * Declare a variable say max and initialize it with array first element.
   Run a loop from index 1 to N, and check
   If arr[i]>max, then set max = arr[i]
   After complete iteration print max.
 */
{
  static int largestElement(int [] nums)
  {
	  int max=nums[0];
	  for(int i=1;i<nums.length;i++)
	  {
		  if(nums[i]>max)
			  max=nums[i];
	  }
	  return max;
	 
  }
  public static void main(String[] args)
  {
	int arr[]= {76,4,87,34,54,6,5};
	System.out.println(largestElement(arr));
}
}
