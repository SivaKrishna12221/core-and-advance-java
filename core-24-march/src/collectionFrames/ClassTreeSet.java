package collectionFrames;

import java.util.Iterator;
import java.util.TreeSet;

public class ClassTreeSet 
{
  void meth1()
  {
	  System.out.println("implementing tree set");
	  TreeSet<Object> set=new TreeSet<Object>();
	  set.add(101);//insertion order is not maintained but first element should be small
	  //set.add("java");//heterogeneous data not allowed
	 // set.add(null);//nulls are not accepted
	  //set.add(101);//duplicates  are not allowed
	 set.add(104);//default capacity is 16;
	 set.add(200);//size increases by double.
	 set.add(99);//It is not synchronized
	 set.add(203);//it is available from java 1.2 version onwards 
	  System.out.println(set);
	  System.out.println("==>"+set.headSet(25));//before values
	  System.out.println("==>"+set.tailSet(25));//after 25 values
	  System.out.println("===Iterator====");
	  //here we are using itearator to retrieve the data
	  Iterator<Object> i=set.iterator();
	  while(i.hasNext())
	  {
		  System.out.println(i.next());
	  }
	  Iterator<Object> i2=set.descendingIterator();
	  while(i2.hasNext())
	  {
		  System.out.println(i2.next());
	  }
	  
	  
	  
  }
  public static void main(String[] args) 
  {
	ClassTreeSet ts=new ClassTreeSet();
	ts.meth1();
}
}
