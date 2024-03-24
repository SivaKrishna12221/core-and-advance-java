package pack2;

import java.util.ArrayList;
import java.util.Iterator;

public class ClassBStreamAPI 
{
	void meth1()
	{
		System.out.println("implementig StreamAPI");
	    ArrayList<Integer> al=new ArrayList<Integer>();
	    al.add(10);
	    al.add(53);
	    al.add(55);
	    al.add(43);
	    al.add(56);
	    System.out.println(al);
	    System.out.println("---------------");
	    Iterator<Integer> i= al.iterator();
	    while(i.hasNext())
	    	System.out.println(i.next());
	    System.out.println("===========");
	    al.forEach(data->System.out.println(data));
	    	
	}
	public static void main(String[] args) 
	{
		new ClassBStreamAPI().meth1();
	}

}
