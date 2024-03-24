package pack4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;


public class CollectionArray 
{
  public void meth1()
  {
	 ArrayList<Object> al=new ArrayList<Object>();
	 al.add(101);//insertion order is maintained
	 al.add("siva");//heterogeneous data is allowed
	 al.add(null);//null are allowed 
	 al.add(101);//duplicates are allowed
	 al.add(13);//it is available for java 1.2 v
	 al.add(34);//its default capacity is 10
	 al.add(23);//its size increases by double
	 al.size();
	 al.add(10);
	 System.out.println("get()"+al.get(al.size()-4));
	 for(int i=0;i<=al.size()-1;i++)
	 {
		 System.out.print(al.get(i)+" ");
	 }
	 for(Object a : al)
	 {
		 System.out.println(a);
	 }
	 Iterator<Object> i=al.iterator();
	 System.out.println("iterator interface");
	while(i.hasNext())
	{
		System.out.print(i.next()+" ");
	}
	ListIterator<Object> li=al.listIterator();
	System.out.print("list iterator interface");
	while(li.hasNext())
	{
		System.out.print(li.next()+" ");
	}
	
  }
  public static void main(String[] args) {
	CollectionArray ca=new CollectionArray();
	ca.meth1();
}
}
