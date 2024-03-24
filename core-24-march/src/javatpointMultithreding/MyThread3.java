package javatpointMultithreding;

public class MyThread3 extends Thread
{
  public void run()
  {
	  ClassTable.printTable(100);
  }
}
