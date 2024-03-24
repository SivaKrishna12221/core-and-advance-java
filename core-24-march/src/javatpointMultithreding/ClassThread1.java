package javatpointMultithreding;

public class ClassThread1 extends Thread
{
  public void run()
  {
	  System.out.println("running");
  }
  public static void main(String[] args) {
	ClassThread1 t1=new ClassThread1();
	Thread t2=new Thread(t1);
	//t1.start();//without connection
	/*
	 * here a new thread will be created and the new thread is responsible
	 * for running the run() method present in the ClassThread1
	 */
	//t1.run();//without connection
	/*
	 * no new thread is created is created classThread  mehthod call just like 
	 * a normal method.
	 */
	//t2.start();//without connection
	/*
	 * A new thread will be created the new thread responsible for running the 
	 * run method present in the Thread;
	 */
	//t2.run();//without connection
	/*
	 * no new thread will be created thread class run method is called just like
	 * a normal method
	 */
	t2.start();//running
}
}
