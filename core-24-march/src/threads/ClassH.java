package threads;

public class ClassH extends Thread
/*
 * synchronization:
 *1)Synchronization in java control multiple threads from accessing the
 *same shared resources in order to prevent inconsistency.
 *2)synchronization is done when want to  allow one thread to access
 *same shared resources 
 *3)Synchronization is a process of making only one thread to access the
 *same shared resources and multiple threads trying to access the resources
 *and moving all the remaining threads into  waiting state.
 *4)the problem of synchronization is it increases the thread waiting state
 *5)we can achieve synchronization in two ways 
 *a)a method can be synchronized
 *b)a block can be synchronized
 */
{
  public void run()
  {
	  criticalResource();//from run method we are calling synchronized method
	  
  }
  synchronized void criticalResource()
  {
     String name=Thread.currentThread().getName();//string is return type for storing
     System.out.println(name+" Thread has entered  critical resources");
     for(int i=1;i<=5;i++)
     {
    	 System.out.println(name+":"+"+i");
     }
     System.out.println(name+"has completed its execution");
  }
  
  public static void main(String[] args) 
  {
	ClassH hobj=new ClassH();
    Thread t1=new Thread(hobj);
    Thread t2=new Thread(hobj);
    Thread t3=new Thread(hobj);
    t1.setName("first ");
    t2.setName("second ");
    t3.setName("third ");
    t1.start();
    t2.start();
    t3.start();
} 
}
/*
 * first  Thread has entered  critical resources
first :+i
first :+i
first :+i
first :+i
first :+i
first has completed its execution
third  Thread has entered  critical resources
third :+i
third :+i
third :+i
third :+i
third :+i
third has completed its execution
second  Thread has entered  critical resources
second :+i
second :+i
second :+i
second :+i
second :+i
second has completed its execution

 */
