package javatpointMultithreding;

public class ClassDeadLock 
{/*
  *Deadlock in Java is a part of multithreading. 
  *Deadlock can occur in a situation when a thread
  * is waiting for an object lock, that is acquired
  *  by another thread and second thread is waiting 
  *  for an object lock that is acquired by first thread. 
  *  Since, both threads are waiting for each other to release
  *   the lock, the condition is called deadlock.

  */
	public static void main(String[] args) {
		final String resource1="siva";
		final String resource2="krishna";
		Thread t1=new Thread()
				{
			public void run()
			{
				synchronized(resource1)
				{
					System.out.println("Thread1 locked on resource1");
				
					
					  try { Thread.sleep(1000);
					  
					  } catch(InterruptedException ie) { System.out.println(ie); }
					 
			    
				synchronized(resource2)
				{
					System.out.println("thread1 locked on resource2");
				}
				}
			}
				};
		  Thread t2=new Thread()
				  {
			  public void run()
			  {
				  synchronized(resource2)
				  {
					  System.out.println("thread2 locked on resource2");
				  
						
						  try { Thread.sleep(1000); } catch(InterruptedException ie) {
						  System.out.println(ie); }
						 
				  synchronized(resource1)
				  {
					  System.out.println("thread2 locked on resource1");
				  }
			  }
			  }
				  };
			t1.start();
			
		   
			t2.start();
	}

}/*
Thread1 locked on resource1
thread2 locked on resource2
*/
