package PrepInstaArraysImpQ;

import java.util.Arrays;

public class RepeatingElementInArray 
{
  public static void countFreq(int arr[],int n)
  {
	  boolean visited[]=new boolean[n];
	  Arrays.fill(visited, false);//method for getting true or false and written in a boolean array
	  for(int i=0;i<n;i++)//check first index position
	  {
		  if(visited[i]==true)//if element match return true and true;
			  continue;
		  int count=1;
		  for(int j=i+1;j<n;j++)
		  {
			 if(arr[i]==arr[j]) 
			 {
				visited[j]=true;
				count++;
			 }
		  }
		  if(count!=1)
		  {
			  System.out.println(arr[i]);
		  }
	  }
	  
		  
	  
  }
  public static void main(String[] args)
  {
	int arr[]=new int[] {10,20,30,10,20,10,30,20,40,50};
	int n=arr.length;
	countFreq(arr,n);	
	}
}

