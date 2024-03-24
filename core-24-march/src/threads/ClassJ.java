package threads;

public class ClassJ 
/*deadlock:
 * In simple dead lock is a condition which occurs when two or more 
 * threads are get blocked and waiting for each other for infinite 
 * period of time to release the resources they hold.
 */
{
 public static void main(String[] args) 
 {
	ClassJ jobj=new ClassJ();
	final String A="Java";
	final String B="python";
	Thread t1=new Thread()
			{
		@Override
		public void run()
		{
		synchronized(A)	//thread is holiding java
		{
			System.out.println("thread 1 locked on A "+A);
		}
		try {
			Thread.sleep(500);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		synchronized(B)
		{
			System.out.println("thread 1 locked on B"+B);
		}
		System.out.println("no dead lock");
		}
		
			};
			 Thread t2= new Thread()
			   {
		  public void run()
		  {
			  synchronized(B)
			  {
				  System.out.println("thread 2 locked on B"+B);
			  }
			  try {
				  Thread.sleep(300);
			  }catch(Exception e)
			  {
				  e.printStackTrace();
			  }
			  synchronized(A)
			  {
				  System.out.println("thread 2 locked on A"+A);
			  }
			  System.out.println("no dead lock");
		  }
		
			   };
	  t1.start();
	  t2.start();
}
 
}
