package pack2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ClassAsorting 
{
  void meth1()
  {
	  System.out.println(" Implementing Sorting");
	  int arr[]= {10,65,34,56,34,63,66,66,23,21,12};
	  System.out.println("Before Sorting array:"+Arrays.toString(arr));
	  Arrays.sort(arr);
	  System.out.println("After Sorting array:"+Arrays.toString(arr));
	  System.out.println("==========================");
	  ArrayList<Integer> al=new ArrayList<Integer>();
	  al.add(10);
	  al.add(24);
	  al.add(23);
	  al.add(43);
	  al.add(12);
	  al.add(10);
	  System.out.println("Before sorting arrayList:"+al);
	 // Arrays.sort(al);//ce becauses it works only for array
	  Collections.sort(al);
	  System.out.println(al);
	  /*
	   * Collections.set (list) it is parameterized method which accepts only list
	   * implemented classes
	   */
	  
  }
  public static void main(String[] args)
  {
	  new ClassAsorting().meth1();
	
}

}
