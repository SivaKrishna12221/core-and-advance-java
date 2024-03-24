package collectionFrames;

import java.util.PriorityQueue;

public class ClassPriorityQueue 
{
	void meth1()
	{
	 System.out.println("implementing priority queue");
     PriorityQueue<Object> pq= new PriorityQueue<Object>();
     pq.add(10);//insertion order is not maintained but always the first element will be the smallest element
     pq.add("siva");//heterogeneous data is allowed
     pq.offer(10);//duplicate values are allowed
     pq.add(null);//null are not allwed
     pq.offer(320);//Its default capacity is :11;
     pq.offer(10);//It is not synchronized
     pq.offer(100);//It is available from java 1.5 v onwards;
     System.out.println(pq);
     System.out.println(pq.poll());//remove & return the 1st element
     System.out.println(pq);
     pq.clear();
     System.out.println(pq.poll());
     System.out.println(pq.remove());
}
	public static void main(String[] args) 
	{
		ClassPriorityQueue pqobj=new ClassPriorityQueue();
		pqobj.meth1();
	}
}