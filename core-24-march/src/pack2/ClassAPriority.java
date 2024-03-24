package pack2;

import java.util.PriorityQueue;

public class ClassAPriority 
{
	void meth1()
	{
		System.out.println("implementing priority queue");
		PriorityQueue<Object> pq=new PriorityQueue<Object>();
		pq.add(56);//Insertion order is not maintained but always the first element will be the Smallest elements
		//pq.add("siva");//heterogeneous data will not be accepted
		//pq.add(null);//nulls are not allowed
		pq.add(12);//duplicates are allowed
		pq.add(32);//it is available from java 1.5 version
		pq.offer(10);//its default capacity is :11
		pq.offer(10);//Its size increases by double
		pq.offer(23);//it is not synchronized
		pq.offer(25);
		System.out.println(pq);
		System.out.println(pq.poll());
		System.out.println(pq);
		pq.clear();
		System.out.println(pq);
		System.out.println(pq.poll());
		System.out.println(pq.remove());//noSuchElementsException
	}
	public static void main(String[] args)
	{
		new ClassAPriority().meth1();
	}

}
