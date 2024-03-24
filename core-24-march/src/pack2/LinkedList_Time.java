package pack2;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedList_Time 
{
	private static Object arr[];
	static
	{
		arr=new Object[100000];
		for (int i=0;i<=arr.length-1;i++)
			arr[i]=new Object();
	}
	void ArrayListTime()
	{
		long Start;
		long end;
	    ArrayList<Object> al=new ArrayList<Object>();
	    Start=System.currentTimeMillis();
	    end=System.currentTimeMillis();
    	System.out.println("Array Construction time "+(end-Start));
	}
	void LinkedListTime()
	{
		long start,end;
	LinkedList<Object>	ll=new LinkedList<Object>();
	start=System.currentTimeMillis();
	for(Object obj2:arr)
	{
		ll.add(obj2);
	}
	end=System.currentTimeMillis();
	System.out.println("linkedList construction Time "+(end-start));
	
	}
	void meth1()
	{
		for (Object O:arr)
			System.out.println(O);
	}
	public static void main(String[] args)
	{
		System.out.println("finding the construction time for an array object");
		LinkedList_Time lt=new LinkedList_Time();
		lt.ArrayListTime();
		lt.LinkedListTime();
		//lt.meth1();
		
	}
	
}
