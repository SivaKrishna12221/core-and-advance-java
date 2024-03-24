package pack3;
/*
 *1) An  Interrupt is an indication to a thread that it should stop what it is doing
 * and do something else
 * 2)For the interrupt mechanism to work correctly the interrupted thread must be
 * in either sleep state on waiting state 
 */

public class ClassAD extends Thread
{
  public void run()
  {
	  System.out.println("I am ready for an Interviews");
	   
	  for (int i=1;i<=5;i++)
	  {
		  System.out.println("This is my "+i+"interview");
	  }
	  System.out.println("I got placed.Now I can relax");
	  try
	  {
	  Thread.sleep(5000);
	  }
	   catch(Exception e)
	  {
		  System.out.println("my sleep got disturbed");
	  }
	  System.out.println("Time to go to office");
  }
  public static void main(String[] args) throws InterruptedException
  {
	ClassAD adobj=new ClassAD();
	Thread t1=new Thread(adobj);
	t1.start();
	t1.interrupt();
}
}
