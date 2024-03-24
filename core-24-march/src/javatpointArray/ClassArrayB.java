package javatpointArray;

public class ClassArrayB
{
  static void min(int arr[])
  {
	int  min=arr[0];
	  for(int i=0;i<=arr.length-1;i++)
	  {
		  if(min>arr[i])
		  {
			 min=arr[i];
		  }
	  }
	  System.out.println(min);
  }
  public static void main(String[] args) {
	int arr[]= {10,320,8,20};
	min(arr);
}
}
