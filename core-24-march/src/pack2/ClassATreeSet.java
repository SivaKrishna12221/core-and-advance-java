package pack2;

import java.util.Iterator;
import java.util.TreeSet;

public class ClassATreeSet 
{
  void meth1()
  {
	  System.out.println("implementing Tree set");
	  TreeSet<Object> set=new TreeSet<Object>();
	  set.add(10);//insertion order is not maintained but sorting order is maintain(Ascending);
	 // ts.add("siva");//heterogeneous data will not be supported
	 // ts.add(null);//null values will not be accepted
	  set.add(20);//duplicate values are not allowed
	  set.add(32);//it is available from java 1.2 version
	  set.add(10);//its default capacity is 16(load factor 0.75)
	  set.add(42);//it size increases by double
	  set.add(35);//it is not synchronized
	  set.add(53);
	  System.out.println(set);
	  System.out.println("Retriving the Treeset data by using the iterator interface");
	  Iterator<Object> i= set.iterator();
	  while(i.hasNext())
		  System.out.print(i.next());
	  
	  System.out.println("===>"+set.headSet(32));
	  System.out.println("===>"+set.tailSet(32));
	  Iterator<Object> di2=set.descendingIterator();
	  while(di2.hasNext())
		  System.out.println(di2.next());
  }
  public static void main(String[] args) 
  {
	  new ClassATreeSet().meth1();
	
}
}
