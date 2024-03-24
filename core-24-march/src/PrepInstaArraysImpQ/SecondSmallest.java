package PrepInstaArraysImpQ;

import java.util.Arrays;
import java.util.Scanner;

public class SecondSmallest 
/*
 * take two int varibles smallest and sec_smallest
 * initialize smallest=arr[0] and sec_smallest=integer.MAX_VALUE;
 * use for loop and find smallest value
 * and again same use another for loop write condition
 * if(arr[i]!=smallest&&arr[i]<sec_smallest)set=>sec_smallest=arr[i];
 * print sec smallest
 */
{
  Scanner sc=new Scanner(System.in);
  void meth1()
  {
	 int n;
	 System.out.println("please enter length of valuess");
	 n=sc.nextInt();
	 int arr[]=new int[n];
	 System.out.println("please enter "+n+" values");
	 for(int i=0;i<n;i++)
	 {
		 arr[i]=sc.nextInt();
	 }
	 System.out.println("second smallest"+sec_smallest(arr,n)+":");
	 
  }
  static int sec_smallest(int [] array,int length)
  {
	  int smallest=array[0];
	  for(int i=1;i<length;i++)
	  {
		  if(array[i]<smallest)
			  smallest=array[i];
	  }
	  int sec_smallest=Integer.MAX_VALUE;//A constant holding the maximum value an int can have, 2^31-1.
      for(int i=1;i<length;i++)
      {
    	  if(array[i]!=smallest&&array[i]<sec_smallest)
    		  sec_smallest=array[i];
      }
	  
      return sec_smallest;
  }
  public static void main(String[] args)
  {
	SecondSmallest aobj=new SecondSmallest();
	aobj.meth1();
}
}
