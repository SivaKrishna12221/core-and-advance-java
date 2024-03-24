package javatpointMultithreding;

public class SynchronizedBlockTest
{
  public static void main(String[] args) {
	  ClassSynchrinizedBlock csb=new ClassSynchrinizedBlock();
	  Thread t1=new Thread()//anonymous class//this are main thread
			  {
		  public void run()
		  {
			  csb.printTable(10);
		  }
			  };
	 Thread t2=new Thread()
			 {
		 public void run()
		 {
			 csb.printTable(100);
		 }
			 };
	  t1.start();
	  t2.start();
}
}
