package PrepInstaArraysImpQ;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemovingDuplicateValues 
/*
 * declare a set data structure
 * Insert  the element of array in set
 * print the set
 */
{
  public static void main(String[] args) 
  {
	int arr[]= {10,20,30,30,10,30,20,30,60,50};
	int n=arr.length;
	Set hash_set=new HashSet();//removing the duplicates
	for(int i=0;i<n;i++)
	{
		hash_set.add(arr[i]);//inorder to store  values inside an array 
	}
	System.out.println((hash_set));
	
}
}
