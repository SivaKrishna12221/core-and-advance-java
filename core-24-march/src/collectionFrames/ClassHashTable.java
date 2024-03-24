package collectionFrames;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map.Entry;

public class ClassHashTable 
{
  void meth1()
  {
	  System.out.println("implementing hashTable");
	  Hashtable<Object,Object> map=new Hashtable<Object,Object>();
	  map.put(101,"mango");//Insertion order is not maintained
	  map.put(12,101);//heterogeneous keys values are allowed
	  //map.put(null,null);//nulls are not allowed
	  map.put(101, "banana");//duplicates are not allowed
	  map.put(105, "grapes");//It is available from java 1.2 version
	  map.put(103,"pineapple");//default capacity is 11(load factor is 0.75)
	  map.put(104,"orange");//It is size increases by double
	  map.put(100,"pomogranate");//it is synchronized
	  System.out.println(map);
	  HashSet<Object> hs= new HashSet<Object>(map.keySet());
	  System.out.println("keys"+hs);
	  Iterator<Object> i=hs.iterator();
	  while(i.hasNext())
	  {
		//Entry e=(Entry)i.next(); 
		//System.out.println(e.getKey() +" "+e.getValue());
	  }
  }
  public static void main(String[] args) 
  {
	ClassHashTable cht=new ClassHashTable();
	cht.meth1();
}
}
