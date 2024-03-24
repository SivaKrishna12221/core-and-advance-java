package pack2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ClassDStreamAPI 
{
   void meth1()
   {
	   System.out.println("Implementing Stream API");
	   ArrayList<Integer> al= new ArrayList<Integer>();
	   al.add(10);
	   al.add(5);
	   al.add(40);
	   al.add(15);
	   al.add(50);
	   al.add(34);
	   System.out.println(al);
	
       
	   List<Integer> li=al.stream().map(data->data*2).collect(collector.tolist());
       System.out.println(li);
	   
   }
   public static void main(String[] args) 
   {
	   new  ClassDStreamAPI().meth1();
	
}
}
