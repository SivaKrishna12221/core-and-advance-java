package collectionFrames;

import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;

public class Queue
{
  void meth1()
  {
   List li1= new LinkedList();
   LinkedList li2=new LinkedList();
   li1.add(101);
  // li1.offer(2320);//c.e error
	  li2.add(32);
	  li2.offer("siva");
  }
  public static void main(String[] args)
  {
	Queue pqobj=new Queue();
	pqobj.meth1();
}
}
