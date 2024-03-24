package pack1;
/*
 * DeadLock:
 * 1)DeadLock describe a situation where two or more threads are 
 * blocked forever & waiting for each other.
 * 2)In simple dead lock is a condition when two or more threads are
 * get blocked ,waiting for each other for an infinite period of time
 * to release the resources they hold.
 */

public class DeadLock
{
	public static void main(String[] args) 
	{
		final String A="Siva";
		final String B="Krishna";
		Thread t1=new Thread()
		{
			public void run()
			{
				synchronized(A)
				{
					System.out.println("Thread 1 lock on A");
				}
				try
				{
					Thread.sleep(100);
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
				synchronized(B)
				{
					System.out.println("Thread 1 lock on B");
				}
				System.out.println("no dead lock");
			}
	    
		};
		Thread t2=new Thread()
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
				}
				synchronized(A)
				{
					System.out.println("Thread 2 lock on A");
				}
			}
			
	};
	t1.start();
	t2.start();
}
}