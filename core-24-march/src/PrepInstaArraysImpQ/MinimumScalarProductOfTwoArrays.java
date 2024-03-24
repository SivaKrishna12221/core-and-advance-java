package PrepInstaArraysImpQ;

import java.util.Arrays;

public class MinimumScalarProductOfTwoArrays 
{
  public static void main(String[] args)
  {
	int arr1[]= {22,45,12,56,78,42};
	int arr2[]= {23,61,13,34,56,85};
	 int n1=arr1.length;
	 int n2=arr2.length;
	 // let declare one variable to store the for swapping purpose
	 int temp=0;
	//arr1 sort into ascending order 
	 for(int i=0;i<n1;i++)//here we check entire array 1ST to last
	 {
		 //for compare remaining values with first index position we take another for loop
		 for(int j=i+1;j<n1;j++)
		 {
			 if(arr1[i]>arr1[j])
			 {//swapping process 
				temp=arr1[i];//greater value store in temp variable 
				arr1[i]=arr1[j];//interchange the values
				arr1[j]=temp;//greater value comes to arr[j] position
				
			 }
		 }
	 }
	 //arr2 sorting into descending order
	 for(int i=0;i<n2;i++)
	 {
		 for(int j=i+1;j<n2;j++)
		 {
			 if(arr2[i]<arr2[j])//if small is present in first throws to last
			 {
				temp=arr2[i] ;//smallest value throws into temp 
				arr2[i]=arr2[j];//interchanging big value cpmes first small comes to last
				arr2[j]=temp; //small value comes to last
				
			 }
		 }
		 
	 }
	//scalar product of vectors
	 int product=0;
	for(int i=0;i<n1;i++)
	{
		product+=arr1[i]*arr2[i];
	}
	System.out.println(product);
	
}
}
