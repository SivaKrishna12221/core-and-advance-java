package pack2;


import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map.Entry;


public class HashTableA 
{
	void meth1()
	{
		System.out.println("implementing HashTable");
		Hashtable<Object,Object> map=new Hashtable<Object,Object>();
		map.put(101,"java");//insertion order is not  maintained
		map.put("java", 101);//heterogeneous keys & values are allowed
	   //map.put(null, "bootsrap");//null keys and null values are not allowed
	   //map.put(null, null);//duplicate values are allowed
		map.put(101, 101);//Its available from java 1.0 v(legacy class)
		map.put("java","java");//size increases by double
		map.put(104, "java");//it is synchronized
		map.put(102,"Oracle");
		map.put(103, "javascript");
		
		System.out.println(map);
		HashSet<Object> hs1=new HashSet<Object>(map.entrySet());
        Iterator<Object> i1=hs1.iterator();
        while(i1.hasNext())
        {
          Entry e =(Entry)i1.next();
          System.out.println(e.getKey()+" "+e.getValue());
        }
	}
	public static void main(String[] args)
	{
		new HashTableA().meth1();
	}

}
