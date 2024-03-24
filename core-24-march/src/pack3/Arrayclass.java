package pack3;

import java.util.ArrayList;

public class Arrayclass
{
  public static void main(String[] args) {
	int arr1[]= {10,20,40,45};
	ArrayList<Integer> al=new ArrayList();
	for(int i=0;i<arr1.length;i++)
	{
		al.add(arr1[i]);
	}
	System.out.println(al);
	System.out.println(al.get(2));
	
}
}
