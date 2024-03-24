package PrepInstaArraysImpQ;

public class RepeatingElementInArray2 
{
  public static void main(String[] args)
  {
	int arr[]= {12,21,12,32,32,13,42,42,12};
	int n=arr.length;
	for(int i=0;i<n;i++)
	{
		int count=0;
		for(int j=i+1;j<n;j++)
		{
			if(arr[i]==arr[j])
			
				count=count+1;
			
			if(count>0)
			{
				System.out.println(arr[i]);
				break;
			}
		}
		
	}
}
}
