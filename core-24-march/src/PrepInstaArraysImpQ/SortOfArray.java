package PrepInstaArraysImpQ;

public class SortOfArray 
{
  public static void main(String[] args)
  {
	int arr[]= {30,43,54,42,23,32,34};
	int temp=0;
	for(int i=0;i<arr.length;i++)
	{
		for(int j=i+1;j<arr.length;j++)//it will check 1st and remaining values;\
		{
			if(arr[i]>arr[j])//if 1st index is big entering into loop otherwise check 3rd index
				
			{
				temp=arr[i];//it returns big value
				arr[i]=arr[j];//
				arr[j]=temp;//in temp value return big
			}
		}
	}
	for(int i=0;i<arr.length;i++)
	{
		System.out.println(arr[i]+" ");
	}
	
	
  }
}
