package javatpointArray;

public class ClassMultiAddition
{
 public static void main(String[] args) {
	int arr1[][]= {{1,2,3},{1,4,8}};
	int arr2[][]= {{1,2,3},{1,4,8}};
	int arr3[][]=new int [2][3];//i=>{0},{1} j={0,1,2},{0,1,2};
	for(int i=0;i<2;i++)
	{
		for(int j=0;j<3;j++)
		{
			arr3[i][j]=arr2[i][j]+arr1[i][j];
			System.out.print(arr3[i][j]+" ");
		}
		System.out.println();
	}
	
}
}
