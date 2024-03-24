package javatpointMultithreding;

public class ClassJoin2  extends Thread
{

	@Override
	public void run() {
		for(int i=1;i<=5;i++)
		{
			try
			{
				Thread.sleep(500);//main thread
			}
			catch(InterruptedException ie)
			{
				System.out.println(ie);
			}
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		ClassJoin2 t1=new ClassJoin2();
		ClassJoin2 t2=new ClassJoin2();
		ClassJoin2 t3=new ClassJoin2();
		t1.start();
		try
		{
			t1.join();
			
		}
		catch(InterruptedException ie)
		{
			System.out.println(ie);
		}
		t2.start();
		t3.start();
		/*
		whenever we are executing the program after completion 
		first thread second thread will be exected but if use
		 join method first thread complete its task
		
		 */
		
	}
  
}
