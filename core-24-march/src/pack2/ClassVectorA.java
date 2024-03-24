package pack2;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class ClassVectorA
{
  void meth1()
  {
	  System.out.println("Implementing the vector Class");
	  Vector<Object> v=new Vector<Object>();
	  v.add(10);//Insertion order is maintained
	  v.add("java");//Heterogeneous data is accepted
	  v.add(null);//nulls are accepted
	  v.add(21);//duplicates are allowed
	  v.add(22);//it is available from java 1.0v
	  v.add(10);//Its default capacity is 10;
	  v.add(12);//size increases by double.
	  v.add(42);//it is  synchronized
	  v.add(15);
	  System.out.println(v);
	  System.out.println("capacity:"+v.capacity());
	  System.out.println(" size:"+v.size());
	  System.out.println("Retriving the data by using Iteator interface");
	  Iterator<Object> i=v.iterator();
	  while(i.hasNext())
		  System.out.print(i.next()+" ");
	  System.out.println();
	  System.out.println("=====================");
	  System.out.println("reterving the data by using enumeration interface");
	  Enumeration<Object> e=v.elements();
	  while(e.hasMoreElements())
		  System.out.print(e.nextElement()+" ");
	 
		 
	  
  }
  public static void main(String[] args)
  {
	new ClassVectorA().meth1();
}
}
