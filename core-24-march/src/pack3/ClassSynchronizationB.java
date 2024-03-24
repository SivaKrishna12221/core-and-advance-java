package pack3;

public class ClassSynchronizationB extends Thread

{
public void run()
{
	criticalResource();
}
 synchronized void criticalResource()
 /* 
  * Synchronization in java control multiple threads from accessing the same shared 
  * resources in order to prevent the inconsistency state;
  * Java synchronization is done when we want to allow to access the shared resources.
  * In simple synchronization is a process of making only one thread access  a resources
  * where multiple threads are trying to access same resources and all the remaining
  * threads into waiting state.
  * The problem with synchronization is it increases the thread waiting time.
  * we can achieve synchronization in two ways 
  * 1)A method can be synchronized 
  * 2)A Block can be synchronized
  */
 {
	 String name=Thread.currentThread().getName();
	 System.out.println(name+"has entered critical resources ");
	 for (int i=1;i<=5;i++)
	 {
		 System.out.println(name+" work in "+i+" time");
	 }
	 System.out.println(name+" has completed its execution");
	
 }
 public static void main(String[] args) throws InterruptedException
 {
  ClassSynchronizationB aobj=new ClassSynchronizationB();
  Thread t1=new Thread(aobj);
  Thread t2=new Thread(aobj);
  Thread t3=new Thread(aobj);
  
  t1.start();
  t1.yield();
  
  t2.start();
  t3.start();
 t1.setName("siva first method");
 t2.setName("Chandu second method");
 t3.setName("sai nath third method");
}

}
