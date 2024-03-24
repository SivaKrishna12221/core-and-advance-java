package pack3;

import java.util.Arrays;

public class Array1 
{
	void meth1()
	{
		System.out.println("Implementing Java Array");
		int arr1[];
		arr1=new int[5];
		int arr2[]=new int[4];
		int arr3[]= {100,200,300};
		int arr4[]=new int[] {15,25,35,45,55,65};
		String s="Java";
		System.out.println("arr1 length:"+arr1.length);//5
		System.out.println("arr2 length:"+arr2.length);//4
		System.out.println("arr3 length:"+arr3.length);//3
		System.out.println("arr4 length:"+arr4.length);//6
		//System.out.println("arr1 length:"+arr1.length());
		System.out.println("String length:"+s.length());//4
		System.out.println("--------------");
		//Index position of an array is used to store and retrive  the data
		
		arr1[1]=11;
		arr1[3]=13;
	//	arr1[5]=16;//AIOB Exception because there is no 5th index position.
		arr1[arr1.length-1]=14;
		arr1[arr3.length-1]=12;
		arr1[arr4.length-arr2.length-2]=10;
		System.out.println("arr1==>"+Arrays.toString(arr1));
		System.out.println("arr2==>"+Arrays.toString(arr2));
		System.out.println("arr3==>"+Arrays.toString(arr3));
		
	}
	public static void main(String[] args)
	{
		
		new Array1().meth1();
	}
	

}
