package pack2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class UserDefinedClassB 
{ 
	void meth1()
	{
		System.out.println("implementing UserDefinedObjects in Arrayslist collections");
		ArrayList<Object> al=new ArrayList<Object>();
		UserDefinedClassA aobj1=new UserDefinedClassA(101,"siva","Bsc");
		UserDefinedClassA aobj2=new UserDefinedClassA(102,"sai","Bcom");
		al.add(aobj1);
		al.add(aobj2);
		al.add(new UserDefinedClassA(103,"Chandu","BBA"));
		al.add(new UserDefinedClassA(104,"Mani","Bsc"));
		System.out.println(al);
		
		System.out.println("------------------");
		System.out.println("Retriving the data by usig iterater interface");
		Iterator<Object> i=al.iterator();
		while(i.hasNext())
			System.out.println(i.next()+" ");
		System.out.println();
		System.out.println("--------------------");
		
	    
	}
	public static void main(String[] args) 
	{
		new UserDefinedClassB().meth1();
	}
}
