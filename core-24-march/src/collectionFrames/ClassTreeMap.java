package collectionFrames;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.TreeMap;

public class ClassTreeMap 
{
 void meth1()
 {
	 System.out.println("implementing TreeMap");
	 TreeMap<Object,Object> map= new TreeMap<Object,Object>();
	 map.put(101,"bull");//insertion order is not maintained first should be small
	// map.put("ox",102);//heterogeneous data not accepted
	// map.put(null, null);//null are not allowed
	 map.put(101, "cow");//duplicate key values are not allowed
	 map.put(103, "cow");//duplicate values not allowed
	 map.put(100, "cow");//it is available from java 1.2 v
	 map.put(105, "horse");//default capacity is 16;
	 map.put(110,"elephant");//it size increses by double
	 System.out.println(map);
	 HashSet hs=new HashSet<Object>(map.keySet());
	 System.out.println("keys"+hs);
	 Iterator<Object> i=hs.iterator();
	 while(i.hasNext())
	 {
		// entry e=(entry)i.next();
		// System.out.println(.getKey()+" "+e.getValue());
	 }
 }
 public static void main(String[] args) 
 {
	ClassTreeMap ctp=new ClassTreeMap();
	ctp.meth1();
}
}
