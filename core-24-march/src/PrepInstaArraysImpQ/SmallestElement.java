package PrepInstaArraysImpQ;

public class SmallestElement 
{
  public int smallest(int [] nums)	
  {
	  int small=nums[0];
	  for(int i=1;i<nums.length;i++)
	  {
		  if(nums[i]<small)
			  small=nums[i];
	  }
	  return small;
  }
  public static void main(String[] args) 
  {
   int arr[]= {62,32,52,63,64,55,34,64,65,66};
   SmallestElement aobj=new SmallestElement();
   int result=aobj.smallest(arr);
   System.out.println(result);
}
}
