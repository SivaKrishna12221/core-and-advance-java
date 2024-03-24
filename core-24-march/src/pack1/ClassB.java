package pack1;

import java.util.*;

public class ClassB 
{
	void meth1()
	{
		System.out.println("implementing vectors");
		Vector<Object> v=new Vector<Object>();
		v.add(10);//insertion order is maintain
		v.add("java");//heterogeneous data allowed
		v.add(null);//nulls are allowed
		v.add(20);//duplicates are allowed
		v.add(1);//it available from java 1.o v(legacy class)
		v.add(30);//default capacity is 10;
		v.add(32);//size increases by double
		v.add(12);//It synchronized by default
		v.add(32);
		System.out.println(v);
		System.out.println("capacity:"+v.capacity());
		System.out.println("size:"+v.size());
		System.out.println("-----------------");
		System.out.println("Retrieving the data by using iterator");
		Iterator<Object> i=v.iterator();
		while(i.hasNext());
		{
			System.out.println(i.next());
		}
	}
	public static void main(String[] args)
	{
		ClassB bobj=new ClassB();
		bobj.meth1();
	}
}