package oct2023;

public class ThreadsClass extends Thread
{
	@Override
	public void run() {
		criticalResource();
		
	}
	 synchronized static criticalResource()
	{
	   for (int i=1;i<=5;i++)
	   {
		   System.out.println("synchronization:");
	   }
	}
	public static void main(String[] args)throws Exception {
	
	ThreadsClass obj=new ThreadsClass();
	Thread t1=new Thread(obj);
	Thread t2=new Thread(obj);//internal thread class run method will getting exeucted
	t1.start();
    t2.start();
	
    
	
	}
}
