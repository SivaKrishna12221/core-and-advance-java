package javatpointArray;

import java.util.Arrays;

public class ClassArrayM
{
 public static void main(String[] args) {
	int arr[][]=new int[2][2] ;//if we instantiate an array mai
	arr[0][0]=10;
	arr[0][1]=20;
	arr[1][0]=20;
	arr[1][1]=20;
	for(int i=0;i<=arr.length-1;i++)
	{
		for(int j=0;j<=arr.length-1;j++)
		{
			System.out.println(arr[i][j]);
		}
	}
	
 }
}
