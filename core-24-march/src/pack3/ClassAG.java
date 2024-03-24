package pack3;

public class ClassAG extends Thread
{
  public void run()
  {
	  System.out.println("I am ready to go home");
	  for(int i=1;i<=5;i++)
	  {
		  System.out.println("This is my "+i+"attempt to book a ticket");
	  }
	  System.out.println("finally our ticket was succesfully booked.So I can relaxed");
	  try
	  {
		  Thread.sleep(5000);
	  }
	  catch(Exception e)
	  {
		  System.out.println("Our sleep was disturbed");
	  }
	  System.out.println("finally i am going to home");
  }
  public static void main(String[] args) throws InterruptedException
  {
	ClassAG agobj=new ClassAG();
	Thread t1 =new Thread(agobj);
	t1.start();
	t1.interrupt();
	//an interrupt is an indication to a thread that should stop what it is doing
		//and do something for thread..
	
	agobj.join();
	/*
	 * join () method allows allows the current executing thread to wait for the
	 * completion of anther thread
	 */
	for (int i=1;i<=5;i++)
	{
		System.out.println("executing join methods "+i+" times");
	}
}
}
