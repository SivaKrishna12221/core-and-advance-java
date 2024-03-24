package pack2;


import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeMap;
import java.util.Map.Entry;


public class TreeMapA 
{
  void meth1()
  {
	  System.out.println("Implementing TreeMap");
	  TreeMap<Object,Object>map =new TreeMap<Object,Object>();
	  map.put(101, "siva");//Insertion order in not maintained but sorting order Keys are maintained.
	  map.put(102, "siva");//Heterogeneous keys are not allowed but heterogeneous values are allowed
	  map.put(101, "sai");//null keys are not allowed but null values are allowed
	 // map.put("sai",101);//duplicate keys are not allowed but duplicate values are allowed
	 // map.put("sai","Chandhana");//its default capacity is 16 (load factor is 0.75)
	  map.put(103,104);//size increases by double
	 // map.put(null, null);//Its not synchronized
	  map.put(105, null);
	  System.out.println(map);
	  LinkedHashSet<Object> lhs=new LinkedHashSet<Object>(map.entrySet());
	  Iterator<Object> i1=lhs.iterator();
	  while(i1.hasNext())
	  {
		   Entry e =(Entry)i1.next();
		   System.out.println(e.getKey()+" "+e.getValue());
	  }
  }
  public static void main(String[] args)
  {
	  new TreeMapA().meth1();
	
}
}
