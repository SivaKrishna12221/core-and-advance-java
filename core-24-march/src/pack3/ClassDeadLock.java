package pack3;

public class ClassDeadLock 
{
 public static void main(String[] args) throws InterruptedException
 { 
	 final String A="Java";
	 final String B="Python";
	 
	 Thread t1=new Thread()
	 {
		//@override
		 public void run()
		 {
			 synchronized(A)
			 /*
			  * In simple synchronization is a process of making only one thread
			  * to access the shared resources and the multiple threads trying 
			  * to access the resources .and waiting for the resources.
			  * Synchronization in java controls multiple threads access the
			  * same shared resources and prevent the inconsistency state.
			  */
			 {
				 System.out.println("Thread 1 locked on A");
			 
			 try
			 {
				 Thread.sleep(10000);
			 }
			 catch(Exception e)
			 {
				 e.printStackTrace();
			 }
			 synchronized(B)
			 {
				 System.out.println("Thread 1 locked on B");
			 }
			 System.out.println("no dead lock");
			 }
		 }
	};
 
 Thread t2=new Thread ()
		 {
	 public void run()
	 {
		 synchronized(B)
		 {
			 System.out.println("Thread 2 lock on B");
			 try
			 {
				 Thread.sleep(100);
			 }
			 catch(Exception e)
			 {
				 e.printStackTrace();
			 }
			 synchronized(A)
			 {
				 System.out.println("Thread 2 locked on A");
			 }
		 }
		 System.out.println("no dead lock");
	 }
		 };
		 t1.start();
		 t2.start();
 }		 
}

 
	 
 
			 
		 
	
	
 

