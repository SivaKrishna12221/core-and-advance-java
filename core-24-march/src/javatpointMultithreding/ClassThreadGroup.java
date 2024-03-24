package javatpointMultithreding;
public class ClassThreadGroup extends Thread
{
 public void run()
 {
	 System.out.println(Thread.currentThread().getName());
 }
 public static void main(String[] args) {
  ClassThreadGroup ctg=new ClassThreadGroup();
  ThreadGroup th1=new ThreadGroup("Thread group 1");
  Thread t1=new Thread(th1,ctg,"first");
  t1.start();
  Thread t2=new Thread(th1,ctg,"second");
  t2.start();
  Thread t3=new Thread(th1,ctg,"third");
  t3.start();
  System.out.println(th1.getName());
  th1.list();
}
}