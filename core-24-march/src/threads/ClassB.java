package threads;

public class ClassB extends Thread
/*
 * single thread:
 * 1)when we invoke java application jvm by default provides thread it
 * is called "main thread".
 * 2)In a single thread appllication execution starts on main method
 *  end with main method only.
 *  3)all the methods in a thread executes in a sequential manner
 *  
 *  Multi-threaded apllication:
 *  1)creating an user thread  from main thread reffered as multi-thread 
 *  application
 *  2)Multi-thread application execution starts on main method only
 *  3)program execution completes when all the running threads come into 
 *   terminated state.
*/
{
  public void run()
  {
	  //declare string and initialize by calling thread
	  String name=Thread.currentThread().getName();//calling a thread class method and get name()
	  int priority= Thread.currentThread().getPriority();
	  System.out.println("run method called from main thread");
	  int i;
	  for(i=1;i<=5;i++)
	  {
		System.out.println(name+"("+priority+")"+"has executed run method:"+i);  
	  }
	  
  }
  public static void main(String[] args)
  {
	ClassB aobj=new ClassB();
	Thread t1=new Thread(aobj);
	t1.setName("siva");
	//t1.setPriority(MIN_PRIORITY);
	t1.setPriority(10);
	t1.start();
	Thread t2=new Thread(aobj);
	t2.setName("krishna");
	t2.setPriority(MAX_PRIORITY);
	t2.start();
}
}
