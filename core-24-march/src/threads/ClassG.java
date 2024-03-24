package threads;

public class ClassG extends Thread
/*
 * Yield():
 *1) yield method provides a mechanism to  inform a thread schedular 
 * that the current thread willing to is handover its current use of process to
 * but it would like to be scheduled back as soon as possible
 * 2)if we are using yield method then the selected thread is give a chance
 * to another threads with same priority
 * 3)If there are several threads with same priority ,then we can't guess which
 * thread is going to be executed
 * 4)we cant guess when the yielded thread will resume its execution>
 */
{
	public void run()
	{
		System.out.println("ClssG run method executed");
		for(int i=1;i<=3;i++)
		{
			System.out.println("clsG run method:"+i);
		}
		
		
	}
	public static void main(String[] args)
	{
		ClassG gobj=new ClassG();
		Thread t1=new Thread(gobj);
		t1.start();
		t1.yield();
		System.out.println("yield method");
		for(int i=1;i<=3;i++)
		{
			System.out.println("yield method:"+i);
		}
	}

}
