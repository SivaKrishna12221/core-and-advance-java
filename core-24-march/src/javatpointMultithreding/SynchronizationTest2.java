package javatpointMultithreding;

public class SynchronizationTest2
{
 public static void main(String[] args) {
	final Table obj=new Table();
	Thread t1=new Thread()
			{
		public void run() {
		obj.printTable(20);
		
		}
		 	};
   Thread t2=new Thread()
		   {
	   public void run() {
		   obj.printTable(100);
	   }
		   };
	t1.start();
	t2.start();
}/*
	 * 20 40 60 80 100 100 200 300 400 500
	 */

}
