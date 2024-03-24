package pack3;

public class ClassDeadLockB 
{
	public static void main(String[] args) 
	{
	  final String A="Java";
	  final String B="Python";
	  Thread t1 =new Thread()
			  {
		//  @override
		  public void run()
		  {
			  synchronized (A)//Thread is holding java
			  {
				  System.out.println("Thread 1 locked on "+A);
			  }
			  try
			  {
				  Thread.sleep(5000);
			  }
			  catch(Exception e)
			  {
				  e.printStackTrace();
			  }
			  synchronized(B)//Thread 1 will be waited  for B(python)
			  {
				  System.out.println("Thread 1 locked on "+B);
			  }
			  System.out.println("no dead lock");
		  }
			  };
		
	
	Thread t2=new Thread()
			{
		//@override
		public void run()
		{
			synchronized (B)
			{
				System.out.println("Thread 2 lock on "+B);
			}
			try
			{
				Thread.sleep(10000);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			synchronized(A)
			{
				System.out.println("Thread 2 locked on "+A);
			}
			System.out.println("no dead lock");
		}
			};
			t1.start();
			t2.start();
	
	}
}
