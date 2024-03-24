package javatpointMultithreding;

public class MyThread1 extends Thread
{
  public void run()
  {
	  ClassTable.printTable(1);
  }
}
