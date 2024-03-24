package javatpointArray;
//Array is a collection of multiple elements of similar data types in a contiguos block of memory
//Array length is fixed
//It not accept homogeneous data type 
//memory wise recommended but performance wise is not recommended

public class ClassArray 
{
  public static void main(String[] args) {
	int arr[]=new int[4];//declaration and instantiation and 
	arr[0]=10;//initialization
	arr[1]=20;
	arr[2]=20;
	arr[3]=30;
	
   for(int i=0;i<=arr.length-1;i++)
   {
	   System.out.println(arr[i]);
   }
   int a[]= {23,434,45};//declaration initialization and instantiation
   
   int arr4[]=new int[] {22,343,35};//declaration initialization  and instantion
   for(int b:arr4)
   {
	   System.out.println(b);
   }
   
}
}
