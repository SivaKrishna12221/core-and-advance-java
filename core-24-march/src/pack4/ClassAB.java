package pack4;

public class ClassAB extends Thread
{
	
	public void run()
	{
		int i;
		for (i=1;i<=10;i++)
		{
			System.out.println("Run method executing:"+i);
			  i++;
		}
		
	}
	public static void main(String[] args)
	{
		ClassAB abobj=new ClassAB();
	     Thread t1 = new Thread(abobj);
	     t1.start();
	     /*
	      * A new thread will be created and that new thread will be responsible 
	      * for running the run() present in ClassAB
	      */
	     t1.run();
	     /*
	      * No new thread will be created ClassAB run() will be called just like
	      * a normal method calling
	      */
	      
		
	    Thread t2=new Thread();
	    t2.start();
	    /*
	     * A new thread will be created  and that new thread will be responsible
	     * for running the run() present in Thread.
	     */
		t2.run();
		/*
		 * NO new thread will be created ,Thread class run() will be called just 
		 * like a normal methods.
		 */
	    
	}

}
