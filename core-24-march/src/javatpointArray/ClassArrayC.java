package javatpointArray;

import java.util.Arrays;

public class ClassArrayC 
{
  static int[] get()
  {
	  return new int[] {20,30,40,40,50};
  }
  public static void main(String[] args) {
	int arr[]=get();
	System.out.println(arr);
	/*
	 * for(int i=0;i<=arr.length-1;i++) { System.out.println(arr[i]); }
	 */
	System.out.println(Arrays.toString(arr));
}
}
