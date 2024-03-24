package streamApi;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ClassD 
{
  void meth1()
  {
	  Vector <Integer>v=new Vector<>();
	  v.add(12);
	  v.add(34);
	  //v.add(null);
	  v.add(123);
	  v.add(32);
	  v.add(43);
		/*
		 * Iterator it=v.iterator(); while(it.hasNext()) {
		 * System.out.print(it.next()+","); } System.out.println();
		 */
	  
	  //Stream <Integer>st1 =v.stream();
	  ArrayList <Object> al=new ArrayList<>();
	  for(Object i:v)
	  {
		  al.add(i);
		  System.out.println(i);
	  }
	  List<Object> li=al.stream().sorted().collect(Collectors.toList());
	  System.out.println(li);
	  
  }
  public static void main(String[] args) {
	new ClassD().meth1();
}
}
