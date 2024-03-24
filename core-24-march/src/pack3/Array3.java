package pack3;
import java.util.Arrays;
import java.util.Scanner;

public class Array3
{
	Scanner sc=new Scanner(System.in);
	void meth1()
	{
		System.out.println("Please specify the length of an array");
		int length=sc.nextInt();
		int arr[]=new int[length];
		System.out.println("Length of an array :"+length);
		System.out.println("Please enter "+length+" int data values");
        for(int i=0;i<=arr.length-1;i++)
        {
        	arr[i]=sc.nextInt();
        }
		System.out.println("Data in arrays:"+Arrays.toString(arr));
	    
		System.out.println("Enter the first index postion :");
		int from_index=sc.nextInt();
		System.out.println("Enter the second index position:");
		int to_index=sc.nextInt();
		System.out.println("reteriving the data in reverse order");
		for(int i=from_index;i>=to_index;i--)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("-----");
		System.out.println("Reteriving the data by using for each loop");
		
		for(int data:arr) 
		{
			System.out.print(data+" ");
		}
		sc.close();
	}
	
	public static void main(String[] args) 
	{
		
		new Array3().meth1();
	}

}
