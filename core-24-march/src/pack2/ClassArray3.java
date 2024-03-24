package pack2;

import java.util.Scanner;
import java.util.Arrays;

//to store integer elements..

public class ClassArray3 
{ 
void meth1()
  {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("How many elements do you want to store:");
	  int len=sc.nextInt();//here we are assigning the length of array
	  int arr1[]=new int[len];// here we are  creating an object for array.and assign the value
	  System.out.println("please enter "+len+" integer elements");
	  for(int i=0;i<=arr1.length-1;i++)//arr1.length=5
	  {
		  arr1[i]=sc.nextInt();
	  }
	  System.out.println("Data entered");
	  System.out.println(Arrays.toString(arr1));
  }
  public static void main(String[] args) 
  {
	  ClassArray3 aobj= new ClassArray3();
	  aobj.meth1();
	
}
}
