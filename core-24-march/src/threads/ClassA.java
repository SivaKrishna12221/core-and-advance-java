package threads;
/*
 * Thread :
 * 1)Thread is a light weight process
 * 2)Thread is a smallest unit of a process
 * 3)process is acts as a host for a thread
 * 4)atleast one process is required to create a thread
 * 5)threads shares same address locations
 * 6)context-switching is for thread
 * 
 * 1)how to create a thread ?
 * a)thread is created by two ways 1)by extend thread key
 * 2)by implement runnable interface(only one abstract method)
 *   whenever we are starting thread by start() method and it will 
 *   execute run();
 *   Steps to create thread .
 *   1)create a class that extends the class with thread or implement 
 *   runnable interface this is available in lang package;
 *   2)public void run()method in that class,this is the default method
 *    for thread;
 *   3)create object to that class(inside main)
 *   4)create a thread class object and connect to the class object
 *   5)start running the thread
 *   
 * 
 */
public class ClassA extends Thread
{
  public void run()
  
  {
	  int i;
	  System.out.println("thread is created and start running run method executed");
	  for(i=1;i<=5;i++)
	  {
		  System.out.println(i);
	  }
  }
  public static void main(String[] args) 
  {
	ClassA aobj=new ClassA();
	Thread tobj=new Thread(aobj);
	tobj.start();
	/*
	 * a new thread will be created And the new thread is responsible
	 * for running the run() present in the class
	 */
	
	//tobj.run();
	/*
	 * no thread is created it called the run method present in the
	 *  class just like normal method
	 */
	Thread t1=new Thread();
	t1.start();
	/*
	 * here new thread will be created and it is responsible creating the 
	 * running the run() method present in the thread 
	 
	 */
	t1.run();
	/*
	 * no new thread is created ,thread class run() will be called the run() method
	 * just like methods
	 */
}
}
/*
 * 
 */
