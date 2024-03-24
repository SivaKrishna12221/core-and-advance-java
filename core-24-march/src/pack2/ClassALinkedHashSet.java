package pack2;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.ListIterator;

public class ClassALinkedHashSet 
{
void method() 
{
	System.out.println("implementing set interface by using LinkedHashSet class");
	LinkedHashSet<Object> lhs=new LinkedHashSet<Object>();
	lhs.add(23);//insertion order is maintained
	lhs.add("siva");//heterogeneous data is accepted
	lhs.add(null);//nulls are allowed
	lhs.add(353);//duplicates values are not allowed
	lhs.add(23);//It is available from java 1.4 version
	lhs.add(34);//its default capacity is 16(load factor is o.75)
	lhs.add(24);//its size increases by double 
	lhs.add(35);//it is not synchronized
	lhs.add(36);
	System.out.println(lhs);
	System.out.println("===listIterator==");
    ArrayList<Object> al=new ArrayList<Object>(lhs);
    ListIterator<Object> lt=al.listIterator();
    while(lt.hasNext())
    	System.out.print(lt.next()+" ");
    System.out.println();
    System.out.println("===============");
    while(lt.hasPrevious())
    	System.out.print(lt.previous()+" ");
    
}
public static void main(String[] args)
{
	new ClassALinkedHashSet().method();
}
}
