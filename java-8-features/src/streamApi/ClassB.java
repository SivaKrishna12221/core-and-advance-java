package streamApi;

import java.util.ArrayList;
import java.util.ListIterator;

public class ClassB {
 public void meth1()
 {
	 System.out.println("implementing streaming api .which is used for manupulate the data");
	 System.out.println("stream api is not a data structure instead it takes input from the collection");
	 System.out.println("it provides functional approach to manipulate the data");
	 System.out.println("stream is used for reading the elements but not save the data");
	 ArrayList <Object>al=new ArrayList();
	 al.add("siva");
	 al.add(1203);
	 al.add(23);
	 al.add(null);
	 al.add("oral");
	 al.add("siva");
	 al.add(23);
	 System.out.println(al);
		/*
		 * Iterator it=al.iterator(); while(it.hasNext()) {
		 * System.out.println(it.next()); }
		 */
	 /*ListIterator li=al.listIterator();..it is not working
	 while(li.hasPrevious())
	 {
		 System.out.println(li.previous());
		 
	 }*/
	 al.forEach(data->System.out.println(data));
 }
  public static void main(String[] args) {
	new ClassB().meth1();
}
}
