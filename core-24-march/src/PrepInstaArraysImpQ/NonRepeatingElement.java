package PrepInstaArraysImpQ;

import java.util.Arrays;
/*
 * To check the status of visited elements create a array of size n.
 Run a loop from index 0 to n and check if (visited[i]==1) then skip that element.
 Otherwise create a variable count = 1 to keep the count of frequency.
 Run a loop from index i+1 to n
 Check if(arr[i]==arr[j]), then increment the count by 1 and set visited[j]=1.
 After complete iteration of inner for loop and check if count==1, then print that ith element.

 */
public class NonRepeatingElement 
{
   public  static void  countFreq(int arr[],int n)
   {
	   boolean visited[]=new boolean[n];
	   Arrays.fill(visited, false);
	   for(int i=0;i<n;i++)
	   {
		   if(visited[i]==true)
			   continue;
		   int count =1;
		   for(int j=i+1;j<n;j++)
		   {
			   if(arr[i]==arr[j])
			   {
				   visited[j]=true;
				   count++;
			   }
			   if(count==1)//if elements are not matching count same
			   {
				   System.out.println(arr[j]);//those values return
			   }
		   }
	   }
   }
  public static void main(String[] args) 
  {
	int arr[]=new int[] {10,20,30,30,40,20,20,30,40,50,60,70};
	int n=arr.length;
	countFreq(arr,n);
}
}
