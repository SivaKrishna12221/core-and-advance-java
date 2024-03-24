package PrepInstaArraysImpQ;

public class CountOddandEvenNumbersInArray
{
 public static void main(String[] args)
 {
	int arr[]= {12,4,43,44,24,46,54,65,3,4,56,656};
	int n=arr.length;
	int counteven=0;
	int countOdd=0;
	for(int i=0;i<n;i++)
	{
		if(arr[i]%2==0)
		{
			counteven=counteven+1;
		}
		else
		{
			countOdd=countOdd+1;
		}
	}
	System.out.println("counteven:"+counteven);
	System.out.println("CountOdd:"+countOdd);
}
}
