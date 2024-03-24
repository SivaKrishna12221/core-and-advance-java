package PrepInstaArraysImpQ;

public class Small_largest_element
{
 public static void main(String[] args) 
 {
   int arr[]= {12,32,35,89,42,9,47,86};
   int small=arr[0];
   int large=arr[0];
   int i;//for two int variables we should assign local variable
   for( i=1;i<arr.length;i++)
   {
	   if(arr[i]<small)//if given index value is less than small value then set small  
	   {
		   small=arr[i];
	   }
	   if(arr[i]>large)
	   {
		   large=arr[i];
	   }
   }
   System.out.println("smallest:"+small);
   System.out.println("largest:"+large);
}
}
