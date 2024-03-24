package javatpointMultithreding;

public class ClassIRunnable implements Runnable//having only run() method
{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("running");
	}
	public static void main(String[] args) 
	{
		Runnable r1=new ClassIRunnable();
		/*
		 * Thread t1=new Thread(c); t1.run(); Thread t2=new Thread("first thread");
		 * String s1=t2.getName(); System.out.println(s1);
		 */
		Thread t3=new Thread(r1,"firstThread");
		t3.start();
		String s2=t3.getName();
		System.out.println(s2);
		
	}//firstThread 
	//running

}
