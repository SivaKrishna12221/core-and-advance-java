package oct2023;

import java.security.KeyStore.Entry;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;

public class CollectionClasss {

	void meth1()
	{
		List<Object> v=new Vector<Object>();
		v.add(10);
		v.add("Siva");
		v.add(null);
		v.forEach(data->System.out.println(data));	
	}
	void meth2()
	{
		List<Object> ll=new LinkedList<Object>();
		ll.add(10);
		ll.add(23);
		ll.add("siva");
		ll.forEach(data->System.out.println(data));
		
		
	}
	public void meth3()
	{
		HashSet<Object> hs=new HashSet<Object>();
		hs.add("siva");//insertion order is not maintained
		hs.add(null);//nulls allowed
		hs.add(20);//heterogeneous data allowedd
		hs.add("siva");//duplicates are not allwed
		hs.forEach(d->System.out.println(d));
		
	}
	public void meth4()
	{
	 Set<Object> set= new TreeSet<Object>();
	 set.add("siva");//insertion order is not maintained
	 set.add("siva");//duplicates are not allowed
	 set.add("Ram");//it used for taking the get country set
	 set.add(null);//nulls are not allowed
	// set.add(130);//heterogeneous data is not allowed
	 set.forEach(st->System.out.println(st));
	}
	public void meth5()
	{
	 Map<Object,Object> hm=new  LinkedHashMap();
	  hm.put("siva", 777777777777l);//insertion order not maintained
	  hm.put("ram",343436434343l);
	  hm.put("sitha", 2233334l);
	  System.out.println(hm.get("siva"));
	  System.out.println(hm);
	 for(Object b:hm.keySet())
	 {
		 System.out.print(b+"\t");
	 }
	 for(Object b:hm.values())
	 {
		 System.out.println(b);
		 System.out.println(); 
	 }
	}
	public void meth6()
	{
	  Map<Object,Object> map=new TreeMap<Object,Object>();
	  map.put("smile", 34343l);//insertion order is not maintained but the sorting order is maintained
	  map.put(2,"smile");//heterogeneous keys are not allowed but the hiterogeneous values are allowed
	  map.put("topics", null);////null keys are not allowed but null values ore allwoed
	  map.put("smile", 3434);//duplicate values are allowed
     LinkedHashSet<Object>	lhs=  new LinkedHashSet<Object>(map.entrySet());
     Iterator<Object> it=lhs.iterator();
     while(it.hasNext())
    {
    	Entry e= (Entry)it.next();
    	System.out.println(e.getKey()+","+e.getValue());
     }
	}
	
	public static void main(String[] args) {
		new CollectionClasss().meth5();
	}
}
