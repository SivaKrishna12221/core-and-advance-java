package PrepInstaArraysImpQ;

import java.util.Arrays;

public class FirstHalfAsce_SecondhalfDesc 
{   
	static void  printOrder(int [] arr,int n)
	{
		Arrays.sort(arr);
		for(int i=0;i<n/2;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
		for(int j=n-1;j>=n/2;j--)
		{
			System.out.print(arr[j]+" ");
		}
		
	}
	
	public static void main(String[] args) 
	{
    int arr[]= {12,32,54,13,53,43,55,67,77};
	int n=arr.length;
	printOrder(arr,n);
}
}