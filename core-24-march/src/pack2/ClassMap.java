package pack2;

import java.util.Map.Entry;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;


public class ClassMap 
{
	void meth1()
	{
		System.out.println("implementing map interface");
		HashMap<Object,Object> hm= new HashMap<Object,Object>();
		
		hm.put(12,"siva");//insertion order is not maintained(java 1.2v)
		hm.put(32,"shanthi");//Heterogeneous keys& Heterogeneous values are allowed
		hm.put("sai",342);//duplicates values  are allowed
		hm.put(53, 35);//Its default capacity is 16(load factor is O.75)
		hm.put(12, "Chandhana");//Its size increases by double 
		hm.put(32, "shanthi");//It is not synchronized
		hm.put(23,"siva");
		System.out.println(hm);
		HashSet<Object> hs1=new HashSet<Object>(hm.keySet());
		System.out.println(hm.keySet());
		System.out.println("--------Retriving the keys----------");
		Iterator<Object> i1=hs1.iterator();
		while(i1.hasNext())
			System.out.println(i1.next());
		System.out.println("----------Retriving the Key-value pairs----------");
		//HashSet<Object> hs2=new HashSet<Object>(hm.entrySet());
		LinkedHashSet<Object> lhs2=new LinkedHashSet<Object>(hm.entrySet());
		Iterator<Object>i2=lhs2.iterator();
		while(i1.hasNext());
		System.out.println(i2.next());
		Entry e=(Entry)i2.next();
		System.out.println(e.getKey()+" "+e.getValue());
	}
	public static void main(String[] args) 
	{
		new ClassMap().meth1();
		
	}

}
