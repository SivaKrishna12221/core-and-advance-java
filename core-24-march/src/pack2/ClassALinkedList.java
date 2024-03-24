package pack2;

import java.util.LinkedList;
import java.util.ListIterator;

public class ClassALinkedList 
{
	void meth1()
	{
		System.out.println("implementing Linkedlist");
		LinkedList<Object> ll=new LinkedList<Object>();
		ll.add(453);//insertion order is maintained
		ll.add("siva");//heterogeneous  data is accepted
		ll.add(null);//nulls are accepted
		ll.add(353);//duplicates are allowed
		ll.add(453);//default capacity is '0'
		ll.add(324);//it  is available from java 1.2 version
		ll.add(342);//its size increase by double
		ll.add(323);//its not synchronized
		ll.add(345);
		System.out.println(ll);
		System.out.println(" Retrieving the data in forward direction by using listIterator");
		ListIterator<Object> li=ll.listIterator();
		while(li.hasNext())
			System.out.print(li.next()+" ");
		System.out.println();
		System.out.println("Retriving the data in backward direction by using ListIterator");
		while(li.hasPrevious())
		    System.out.print(li.previous()+" ");
		System.out.println();
		System.out.println("------------------");
		System.out.println(ll.getFirst());
		System.out.println("get middle"+ll.get(3));
		System.out.println(ll.getLast());
	   
		
	}
	public static void main(String[] args) 
	{
		new ClassALinkedList().meth1();
		
	}

}
