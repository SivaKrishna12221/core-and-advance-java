package pack3;

public class ClassDaemonThread extends Thread
{
	public void run()
	{
	int i=0;
	while(true)
	{
		i=i+1;
		System.out.println("Daemon:"+i);
	}
	}
	public static void main(String[] args) 
	{
		ClassDaemonThread dobj=new ClassDaemonThread();
	    Thread t1=new Thread(dobj);
		t1.setDaemon(true);//assaign boolean value to while
		/*
		 * Daemon Thread is a low priority Thread that runs in the background
		 * to perform tasks such as Garbage Collector..
		 * Daemon Thread is infinite Executing Thread .Execution of a Daemon Thread
		 * is stop after its supporting thread execution is terminated.
		 */
		t1.start();
		
		//dobj.setDaemon(true);
		//dobj.start();
		
		
		for(int i=1;i<=20;i++)
		{
			System.out.println("main:"+i);
			
		}
		System.out.println("ends of main");
		
	}
	
	

}
