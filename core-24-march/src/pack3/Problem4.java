/*
 * Given an array of ints ,return true if the array is length 1 or more ,
 * and the first element and the element are equal .
 */
package pack3;

public class Problem4 
{
	public boolean SameFirstLast(int [] nums)
	{
		if(nums.length>=1&&nums[0]==nums[nums.length-1])
		
			
					return true;
							return false;
		
			
	}
	public static void main(String[] args) 
	{
	   Problem4 aobj=new Problem4();
	   int input[]= {22,33,434,2};
	   boolean result=aobj.SameFirstLast(input);
	   System.out.println(result);
	}
}
