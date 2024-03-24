package pack3;

public class DaemonDemo extends Thread
{
   public void run()
   {
	   int i=0;
	   while(true)
	   {
		   i=i+3;
		   System.out.println("Daemon:"+i);
	   }
   }
   public static void main(String[] args)
   {
    DaemonDemo dobj =new DaemonDemo();
    Thread t1=new Thread(dobj);
    t1.setDaemon(true);
    /*
     * Daemon Thread is a low priority thread  it is run in background performing
     * tasks such as a garbage collector;
     * Daemon Thread is a infinite executing Thread .Daemon thread will stop after
     * its supports thread execution terminated.
     */
    t1.start();
    
    for(int i=1;i<=20;i++)
    {
    	System.out.println("main thread will be executed "+i+" times");
    	
    }
	System.out.println("main Thread end");
}
}
