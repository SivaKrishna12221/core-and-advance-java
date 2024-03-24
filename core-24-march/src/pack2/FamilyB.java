package pack2;

import java.util.LinkedList;
import java.util.ListIterator;

public class FamilyB 
{
	void meth1()
	{
		System.out.println("implementing user defined objects and passing those values into LinkedList");
		LinkedList<Object> ll=new LinkedList<Object>();
		FamilyA aobj1=new FamilyA(1,"Ganganna",65);
		FamilyA aobj2=new FamilyA(2,"Rovanamma",60);
		FamilyA aobj3=new FamilyA(3,"Anjaneyulu",43);
		FamilyA aobj4=new FamilyA(4,"VeeraDevi",40);
		ll.add(aobj1);
		ll.add(aobj2);
		ll.add(aobj3);
		ll.add(aobj4);
		ll.add(new FamilyA(5,"SivaKrishna",22));
		ll.add(new FamilyA(6,"Gayathri",20));
		ll.add(new FamilyA(7,"Hanumanth",16));
		System.out.print(ll);
		System.out.println("===============");
		System.out.println("Retriving the data from the linked list collection by using Iterator interface method "
				+ "forward direction");
		ListIterator<Object> li=ll.listIterator();
		while(li.hasNext())
		System.out.println(li.next());
		System.out.println();
		System.out.println("Retriving the data in reverse order by using Backword direction");
		while(li.hasPrevious())
			System.out.println(li.previous());
	}
	public static void main(String[] args)
	{
		new FamilyB().meth1();
		
	}

}
