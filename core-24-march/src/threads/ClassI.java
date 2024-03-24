package threads;

public class ClassI extends Thread
{
  public void run()
  {
	  String name=Thread.currentThread().getName();
	  System.out.println(name+"has entered run()");
	  synchronized(this)//first thread executed sequentially remaining randomly
	  {
		  
	  for(int i=1;i<5;i++)
	  {
		  System.out.println(name+" :"+i);
	  }
	  }
  }
  public static void main(String[] args) 
  {
	ClassI iobj=new ClassI();
	Thread t1=new Thread(iobj);
	t1.start();
	t1.setName("first");
	Thread t2=new Thread(iobj);
	t2.start();
	t2.setName("second");
	Thread t3=new Thread(iobj);
	t3.start();
	t3.setName("third");
}
}
/*
 * firsthas entered run()
first :1
first :2
first :3
first :4
thirdhas entered run()
third :1
third :2
secondhas entered run()
third :3
third :4
second :1
second :2
second :3
second :4
*/
