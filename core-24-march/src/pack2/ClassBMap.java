package pack2;


import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class ClassBMap 
{
 void meth1()
 {
	 System.out.println("Implementing LinkedHashMap");
	 LinkedHashMap<Object,Object> map=new LinkedHashMap<Object,Object>();
	 map.put(101, "java");//insertion order is maintained
	 map.put(102,"Oracle");//heterogeneous key & heterogeneous value are allowed
	 map.put(103, "java");//duplicate keys are not allowed but duplicate values are allowed
	 map.put(102, "python");//it  is available from java 1.4 v
	 map.put("javaScript",104);//nulls are allowed
	 map.put("Adv.java", 105);//its default capacity is 16 (load factor is 0.75)
	 map.put("bootsrap", 105);//Its size increases by double 
	 map.put(null, null);//its not synchronized
	 System.out.println(map);
	 HashSet<Object> hs1=new HashSet<Object>(map.keySet());
	 System.out.println("keys:"+hs1);
	 System.out.println("===========Retriving the keys============");
	 Iterator<Object> i1=hs1.iterator();
	 while(i1.hasNext())
		 System.out.println(i1.next());
     HashSet<Object> hs2 =new HashSet<Object>(map.entrySet());
     Iterator<Object> i2=hs2.iterator();
     while(i2.hasNext())
    	 System.out.println(i2.next());
     Entry e=(Entry)i2.next();
     System.out.println(e.getKey()+" "+e.getValue());
 }
 public static void main(String[] args) 
 {
	new ClassBMap().meth1();
}
}
