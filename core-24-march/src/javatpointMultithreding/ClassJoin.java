package javatpointMultithreding;
public class ClassJoin extends  Thread
{
  public void run()
  {
	for(int i=1;i<=5;i++)
	{
		try
		{
			sleep(300);
		}
		catch(InterruptedException ie)
		{
			ie.printStackTrace();
		}
		System.out.println(i);
	}
  }
  public static void main(String[] args) {
	ClassJoin t1=new ClassJoin();
	ClassJoin t2=new ClassJoin();
	ClassJoin t3=new ClassJoin();
	t1.start();
	try
	{
	  System.out.println("first thread:"+Thread.currentThread().getName());
	   t1.join();
	   
	}
	catch(InterruptedException ie)
	{
		System.out.println(ie);
	}
	t2.start();
	try
	{
	System.out.println("second thread:"+Thread.currentThread().getName());
	t2.join();
	}
	catch(InterruptedException ie)
	{
		System.out.println(ie);
	}
	
}
}
