package pack1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class largestOfaNumberr 
{
 //find out the largest elements in the array
	
  public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("specify array length");
	int arr1[]= new int[sc.nextInt()];
	System.out.println("enter "+arr1.length+ "values");
	for(int i=0;i<arr1.length;i++)
	{
		arr1[i]=sc.nextInt();
	}
	System.out.println(Arrays.toString(arr1));
	Set hash_set=new HashSet();
    for(int i=0;i<arr1.length;i++)
    {
    	hash_set.add(arr1[i]);
    	
    }
    System.out.println(hash_set);
	
	
	
}
}
