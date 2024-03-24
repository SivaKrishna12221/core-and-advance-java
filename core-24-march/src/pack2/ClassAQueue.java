package pack2;

import java.util.LinkedList;
import java.util.List;

public class ClassAQueue 
{
	/*
	 * The implementation classes for queue interface are  linked list & priority queue
	 * In Queue elements are  stored in the form of FirstIn-FirstOut
	 * If we are creating  an object for linkedList with linked list Reference variable ,
	 * then we can access complete functionality of the queue & list.
	 * From 1.5 onwards LinkedList also implements queue
	 */
  void meth1()
  {
	  System.out.println("implementing  queue");
	  List<Object> li1=new LinkedList<Object>();
	  LinkedList<Object> li2=new LinkedList<Object>();
	  //list==>add()
	  //queue==>Offer()
	  li1.add(10);
	 // li1.Offer(20);//c.e because we cannot access "queue" method with "list" Reference.
	  li2.add(100);
	//  li2.Offer(334);
	  System.out.println(li1);
	  System.out.println(li2);
  }
  public static void main(String[] args)
  {
	  new ClassAQueue().meth1();
	
}
}
