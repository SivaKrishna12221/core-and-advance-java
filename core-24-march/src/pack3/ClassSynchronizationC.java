package pack3;

public class ClassSynchronizationC extends Thread
{
 public void run()
 {
	 
	 String name=Thread.currentThread().getName();
	 System.out.println(name+"has entered run");
	 synchronized(this)
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println(name+":"+i);
		}
		System.out.println(name+" has completed its execution");
	}
 }
 public static void main(String[] args)
 {
	 ClassSynchronizationC aobj=new ClassSynchronizationC();
	 Thread t1=new Thread(aobj);
	 Thread t2 =new Thread(aobj);
	 Thread t3=new Thread(aobj);
	 t1.setName("first-thread");
	 t2.setName("second-thread");
	 t3.setName("Third-Thread");
	 t1.start();
	 t2.start();
	 t3.start();
	
}
}
