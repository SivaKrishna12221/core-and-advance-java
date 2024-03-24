package collectionFrames;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class ClassMap 
{
  void  meth1()
  {
	 System.out.println("Implementing map interface"); 
	 HashMap<Object,Object> map=new HashMap<Object,Object>();
	 map.put(101, "siva");//Insertion order is not maintained
	 map.put(102, "krishna");
	 map.put(null,null);//null keys and null values  are allowed
	 map.put(103, "sitha");//duplicate keys are not allowed 
	 map.put(104, 101);//heterogeneous data is accepted
	 map.put(105, "sitha");// duplicate values are allowed
	 map.put(108, "sitha");//default capacity is 16(load factor is 0.75);
	 map.put("ram",101);//it is not synchronized 
	 System.out.println(map);
	 HashSet<Object> hs1=new HashSet<Object>(map.keySet());
	 System.out.println("keys:"+hs1);//here we will keys
	 Iterator<Object> i=hs1.iterator();
	 while(i.hasNext())
	 {
		 System.out.println(i.next());
	 }
  }
  public static void main(String[] args) 
  {
	ClassMap cobj=new ClassMap();
	cobj.meth1();
}
}
