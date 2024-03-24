package pack2;

import java.util.Arrays;

public class ClassEStreamAPI 
{
	void meth1()
	{
		System.out.println("Arrays.ParallelSort");
		int arr[]= {10,24,43,32,12,65,53,64,62,73};
		System.out.println(Arrays.toString(arr));
		//Arrays.sort(arr);
		//System.out.println(Arrays.toString(arr));
		Arrays.parallelSort(arr,1,9);
		System.out.println(Arrays.toString(arr));
	}
	public static void main(String[] args)
	{
		new ClassEStreamAPI().meth1();
	}

}
