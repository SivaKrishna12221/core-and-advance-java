package javatpointMultithreding;

public class TableThread1 extends Thread
{
   Table t;//has a propery
   TableThread1(Table t)
  {
	  this.t=t;
  }
  public void run()
  {
	  t.printTable(5);
  }
}
