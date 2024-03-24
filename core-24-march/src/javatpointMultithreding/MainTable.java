package javatpointMultithreding;

public class MainTable 
{
  public static void main(String[] args) {
	 Table t1=new Table();
	 TableThread1 th1=new TableThread1(t1); //if this are user threads you need to connect it
	
	 TableThread2 th2=new TableThread2(t1);
	 th1.start();
	 th2.start();
	 
	
}
}
