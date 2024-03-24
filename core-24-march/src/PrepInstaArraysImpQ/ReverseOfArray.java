package PrepInstaArraysImpQ;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseOfArray 
{
  
  void meth1()
  {
	  int arr[]= {12,32,43,4,46,45,54,454};
	  for(int i=arr.length-1;i>=0;i--)
	  {
		System.out.print(arr[i]+" ");
	  }
	  System.out.println();
	  System.out.println(Arrays.toString(arr));
	  
	  
		  
  }
  public static void main(String[] args)
  {
	ReverseOfArray aobj=new ReverseOfArray();
	aobj.meth1();
}
}
