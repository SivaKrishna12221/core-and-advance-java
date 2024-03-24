package PrepInstaArraysImpQ;

public class Sort 
{
  public static void main(String[] args) {
	int arr[]= {24,34,24,33,35,54};
    int temp=0;
    int n=arr.length;
    for(int i=0;i<n-1;i++)
    {
    	for(int j=i+1;j<n;j++)
    	{
    		if(arr[i]>arr[j])
    		{
    			temp=arr[i];
    			arr[i]=arr[j];
    			arr[i]=temp;
    		}
    	}
    }
   for(int i=0;i<n;i++)
   {
	   System.out.println(arr[i]);
   }
} 
}
