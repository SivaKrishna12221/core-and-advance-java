/*
 * Given an array of ints,return true if 6 appears either the first and last element
 * in the array .The array will be length 1 or more.
 */
package pack3;

public class Problem3
{
	public boolean FirstLast6(int []nums) 
	{
		if (nums[0]==6||nums[nums.length-1]==6)
			return true;
		return false;
	     
	}
	public static void main(String[] args) 
	{
	   Problem3 aobj =new Problem3();
	   int input[]= {233,34,5,};
	   boolean result=aobj.FirstLast6(input);
	   System.out.println(result);
		
	}
	

}
