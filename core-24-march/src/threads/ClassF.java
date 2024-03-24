package threads;
/*
 * Interrupted method:
 * An interrupt is an indication to thread that it should be stop 
 * what it is doing do something else
 */
public class ClassF extends Thread
{
  public void run()
  {
	  System.out.println("Im ready for an interview");
	  for(int i=1;i<=4;i++)
	  {
		  System.out.println("I attend "+i+" interviews");
	  }
	  System.out.println("finally i got job ,now i am relax");
	  try{
	  Thread.sleep(5000);//here it got disturbed by using interrupted exception
	  }
	  catch(Exception e)
	  {
		  System.out.println("my sleep got distubed ");
	  }
	  System.out.println("this time to go office ");
  }
  public static void main(String[] args)throws InterruptedException
  {
	ClassF fobj=new ClassF();
	Thread t1=new Thread(fobj);
  
	t1.start();
	t1.interrupt();
}
}
