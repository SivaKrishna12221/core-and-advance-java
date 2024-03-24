package pack2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Stream;

public class ClassCStreamAPI 
{
  void meth1()
  {
	  System.out.println("Implementing Stream API ");
	  ArrayList<String> al=new ArrayList<String>();
	  al.add("Siva Krishna");
	  al.add("Sai Chandhana");
	  al.add("Hari keerthi");
	  al.add("Pavan Kumar");
	  al.add("sai nath");
	  al.add("Siva reddy");
	  al.add("Vinod Kumar");
	  System.out.println(al);
	  Stream<String> s1=al.stream();
	  Stream<String> s2=s1.filter(data->data.length()>10);
	  long num=s2.count();
	  System.out.println(num);
	  System.out.println("num:"+al.stream().filter(data->data.length()>11).count());
  }
  public static void main(String[] args) 
  {
	  new ClassCStreamAPI().meth1();
	
}
}
